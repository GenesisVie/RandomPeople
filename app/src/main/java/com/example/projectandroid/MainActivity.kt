package com.example.projectandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectandroid.model.Machin
import com.example.projectandroid.model.userApi.UserResult
import com.example.projectandroid.network.ApiError
import com.example.projectandroid.network.ApiHelpers
import com.example.projectandroid.network.ApiRequestCallback
import com.example.projectandroid.recyclerview.MachinAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    val apiHelpers = ApiHelpers(this)
    lateinit var userResList: MutableList<UserResult>
    lateinit var adapter: MachinAdapter
    lateinit var machins: MutableList<Machin>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        machins = mutableListOf()
        adapter = MachinAdapter(
            machins,
            onClickListener = { view, user -> openActivity(view, user)}
            )
        val recyclerView = RV_id// on récupère ici le RV concerné
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        loadUserByApi()
    }

    private fun openActivity(view: View, user: Machin) {
        Toast.makeText(this, user.email, Toast.LENGTH_SHORT).show()
        val intent = Intent(view.context, DetailActivity::class.java)
        intent.putExtra("LargeAvatar", user.avatar)
        startActivity(intent)
    }

    private fun loadUserByApi() {
        apiHelpers.getNbUserMaxAsync(50,
            object : ApiRequestCallback<UserResult>() {
                override fun onSuccess(result: UserResult) {
                    super.onSuccess(result)
                    Log.d("Res", result.toString())
                    runOnUiThread {
                        val resultList = result.results
                        for (itemUser in resultList) {
                            machins.add(
                                Machin(
                                    itemUser.login.username, itemUser.email, itemUser.picture.large
                                )
                            )
                        }
                        adapter.notifyDataSetChanged()
                    }
                }

                override fun onError(error: ApiError) {
                    super.onError(error)
                    Log.d(
                        MainActivity::class.java.canonicalName,
                        "onError() called with: error.code  = [" + error.code
                            .toString() + " & error.message" + error.message + "]"
                    )
                }
            }
        )
    }
}

package com.example.projectandroid.network;

import com.example.projectandroid.model.Weather;
import com.example.projectandroid.model.userApi.UserResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Nicolas Churlet on 21/03/2018.
 */

public interface ErpInterventionApiService {

    // region GETTER ALL
    // region Used

    // endregion Used
    // region Unused
//    @GET("/api/Contacts/list")
//    abstract Call<List<Contacts>> contacts();
//    @GET("/api/Devis/list")
//    abstract Call<List<Devis>> devis();
//    @GET("/api/PreDevis/list")
//    abstract Call<List<PreDevis>> preDevis();
//    @GET("/api/Reassort/list")
//    abstract Call<List<Reassort>> reassort();
//    @GET("/api/Regie/list")
//    abstract Call<List<Regie>> regie();
//    @GET("/api/Utilisateur/list")
//    abstract Call<List<Utilisateur>> utilisateur();

//    @GET("/api/Affaire/list")
//    Call<List<Affaire>> affaire();
//    @GET("/api/Clients/list")
//    Call<List<Client>> getClients();
//
//    @GET("/api/Intervention/list")
//    Call<List<Intervention>> getInterventions();
//    @GET("/api/Intervention/list")
//    Call<List<Intervention>>
//    getInterventionsfiltered(
//            @Query(value = "Filters[0].Field", encoded = true) String lestringDebut,
//            @Query(value = "Filters[0].Values[0]", encoded = true) String dateDebut,
//            @Query(value = "Filters[0].Op", encoded = true) String opGT,
//            @Query(value = "Filters[1].Field", encoded = true) String encorelestringDebut,
//            @Query(value = "Filters[1].Values[0]", encoded = true) String datefin,
//            @Query(value = "Filters[1].Op", encoded = true) String opLT
//    );
//
//    @GET("/api/RendezVous/list")
//    abstract Call<List<RendezVous>> getRendezVousList();
//
//    @GET("/api/RendezVous/list")
//    Call<List<RendezVous>>
//    getRdvsfiltered(
//            @Query(value = "Filters[0].Field", encoded = true) String lestringDebut,
//            @Query(value = "Filters[0].Values[0]", encoded = true) String dateDebut,
//            @Query(value = "Filters[0].Op", encoded = true) String opGT,
//            @Query(value = "Filters[1].Field", encoded = true) String encorelestringDebut,
//            @Query(value = "Filters[1].Values[0]", encoded = true) String datefin,
//            @Query(value = "Filters[1].Op", encoded = true) String opLT,
//            @Query(value = "FromMobile", encoded = true) Boolean fromMobile
//    );
//
//    @GET("/api/RDVLibre/list")
//    Call<List<RendezVousLibre>>
//    getRdvLibresfiltered(
//            @Query(value = "Filters[0].Field", encoded = true) String lestringDebut,
//            @Query(value = "Filters[0].Values[0]", encoded = true) String dateDebut,
//            @Query(value = "Filters[0].Op", encoded = true) String opGT,
//            @Query(value = "Filters[1].Field", encoded = true) String encorelestringDebut,
//            @Query(value = "Filters[1].Values[0]", encoded = true) String datefin,
//            @Query(value = "Filters[1].Op", encoded = true) String opLT,
//            @Query(value = "FromMobile", encoded = true) Boolean fromMobile
//    );
    // endregion Unused
    // endregion GETTER ALL

    // region GETT BY ID
    // region Used
    @GET("/weather?/{id}")
    Call<Weather> getWeatherById(@Path("id") long id);

    @GET("/api/")
    Call<UserResult> getNbMaxUser(@Query("results") long results);
    // endregion Used
    // region Unused
//    @GET("/api/Contacts/{id}")
//    Call<List<Contacts>> getContactsById(@Path("id") Integer id);
//    @GET("/api/Reassort/{id}")
//    Call<List<Reassort>> getReassortById(@Path("id") Integer id);
//    @GET("/api/Regie/{id}")
//    Call<List<Regie>> getRegieById(@Path("id") Integer id);
//    @GET("/api/Utilisateur/{id}/generatepassword")
//    Call<List<Utilisateur>> getUtilisateurById(@Path("id") Integer id);
//    // endregion Unused
    // endregion GETT BY ID

    // region DELETE
    // region Used

    // endregion Used
    // region Unused
//    @DELETE("/api/InterventionRapport/{id}/photo/{id2}")
//    Call<DataResponse> removeRapportPhoto(@Path("id") Long id, @Path("id2") Long id2);
//    @DELETE("/api/PreDevis/{id}/photo/{id2}")
//    Call<DataResponse> removePredevisPhoto(@Path("id") Long id, @Path("id2") Long id2);
//    @DELETE("/api/Affaire/{id}")
//    Call<DataResponse> removeAffaire(@Path("id") Long id);
//    @DELETE("/api/Clients/{id}")
//    Call<DataResponse> removeClients(@Path("id") Long id);
//    @DELETE("/api/Contacts/{id}")
//    Call<DataResponse> removeContacts(@Path("id") Long id);
//    @DELETE("/api/Devis/{id}")
//    Call<DataResponse> removeDevis(@Path("id") Long id);
//    @DELETE("/api/Intervention/{id}")
//    Call<DataResponse> removeIntervention(@Path("id") Long id);
//    @DELETE("/api/InterventionRapport/{id}")
//    Call<DataResponse> removeInterventionRapport(@Path("id") Long id);
//    @DELETE("/api/PreDevis/{id}")
//    Call<DataResponse> removePreDevis(@Path("id") Long id);
//    @DELETE("/api/Reassort/{id}")
//    Call<DataResponse> removeReassort(@Path("id") Long id);
//    @DELETE("/api/Regie/{id}")
//    Call<DataResponse> removeRegie(@Path("id") Long id);
//    @DELETE("/api/RendezVous/{id}")
//    Call<DataResponse> removeRendezVous(@Path("id") Long id);
//    @DELETE("/api/Utilisateur/{id}")
//    Call<DataResponse> removeUtilisateur(@Path("id") Long id);
    // endregion Unused
    // endregion DELETE

    // region PUT
    // region Used
    // endregion Used
    // region Unused
//    @PUT("/api/InterventionRapport/{id}")
//    Call<DataResponse> updateInterventionRapport(@Path("id") String id, @Body InterventionRapport interventionRapport);
//    @PUT("/api/PreDevis/{id}")
//    Call<DataResponse> updatePreDevis(@Path("id") String id, @Body PreDevis preDevis);
//    @PUT("/api/Affaire/{id}")
//    Call<Affaire> updateAffaire(@Path("id") String id, @Body Affaire affaire);
//    @PUT("/api/Clients/{id}")
//    Call<Clients> updateClients(@Path("id") String id, @Body Clients clients);
//    @PUT("/api/Contacts/{id}")
//    Call<Contacts> updateContacts(@Path("id") String id, @Body Contacts contacts);
//    @PUT("/api/Devis/{id}")
//    Call<Devis> updateDevis(@Path("id") String id, @Body Devis devis);
//    @PUT("/api/Intervention/{id}")
//    Call<Intervention> updateIntervention(@Path("id") String id, @Body Intervention interventions);
//    @PUT("/api/Regie/{id}")
//    Call<Regie> updateRegie(@Path("id") String id, @Body Regie regie);
//    @PUT("/api/RendezVous/{id}")
//    Call<RendezVous> updateRendezVous(@Path("id") String id, @Body RendezVous rendezVous);
//    @PUT("/api/Utilisateur/{id}")
//    Call<Utilisateur> updateUtilisateur(@Path("id") String id, @Body Utilisateur utilisateur);
    // endregion Unused
    // endregion PUT

    // region POST
    // region Used
// endregion Used
    // region Unused

//    @POST("/api/Auth/Login")
//    Call<LoginResponse> login(@Body Login login);
//    @POST("/api/Auth/Logout")
//    Call<DataResponse> logout();
//    @POST("/api/InterventionRapport/{id}/photo")
//    Call<DataResponse> sendRapportPhoto(@Path("id") Long id, @Body Photo photo);
//    @POST("/api/InterventionRapport")
//    Call<InterventionRapport> createInterventionRapport(@Body InterventionRapport interventionRapport);
//    @POST("/api/Reassort")
//    Call<DataResponse> createReassort(@Body Reassort reassort);
//    @POST("/api/PreDevis")
//    Call<PreDevis> createPreDevis(@Body PreDevis preDevis);
//    @POST("/api/PreDevis/{id}/photo")
//    Call<DataResponse> sendPredevisPhoto(@Path("id") Long id, @Body Photo photo);
//    @POST("/api/Clients")
//    Call<DataResponse> createClients(@Body Clients clients);
//    @POST("/api/Contacts")
//    Call<DataResponse> createContacts(@Body Contacts contacts);
//    @POST("/api/Intervention")
//    Call<DataResponse> createIntervention(@Body Intervention intervention);
//    @POST("/api/Regie")
//    Call<DataResponse> createRegie(@Body Regie regie);
//    @POST("/api/RendezVous")
//    Call<DataResponse> createRendezVous(@Body RendezVous rendezVous);
//    @POST("/api/Utilisateur")
//    Call<DataResponse> createUtilisateur(@Body Utilisateur utilisateur);
    // endregion Unused
    // endregion POST

    // region PATCH
//    @PATCH("/api/Reassort/{id}")
//    Call<List<Reassort>> getReassortById(@Path("id") Integer id, Reassort reassort);
    // endregion PATCH
}

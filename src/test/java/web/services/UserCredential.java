package web.services;

import web.models.UserModel;

import java.util.Hashtable;

public class UserCredential {
    public UserModel getUserCredentialByRole (String role) {
        Hashtable<String, UserModel> userHash = createUserHash();

        return userHash.get(role);
    }

    private Hashtable createUserHash() {
        Hashtable<String, UserModel> userHash = new Hashtable<>();
        userHash.put("admin", getAdminCredential());
        userHash.put("director", getDirectorCredential());

        return userHash;
    }

    private UserModel getAdminCredential () {
        UserModel user = new UserModel();
        user.setAdminCredantial();

        return user;
    }

    private UserModel getDirectorCredential () {
        UserModel user = new UserModel();
        user.setDirectorCredential();

        return user;
    }
}

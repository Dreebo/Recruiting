package web.services;

import web.models.UserModel;

public class UserCredential {
    public UserModel getUserCredentialByRole (String role) {
        UserModel user = new UserModel();

        if (role == "admin") {
            return getAdminCredential();
        } else if (role == "director") {
            return getDirectorCredential();
        }

        return user;
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

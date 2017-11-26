package androidthai.in.th.firebaseung.utility;

/**
 * Created by masterung on 26/11/2017 AD.
 */

public class UserModel {

    private String uidString, nameDiaplayString;

    public UserModel() {
    }   // For Getter

    public UserModel(String uidString,
                     String nameDiaplayString) {
        this.uidString = uidString;
        this.nameDiaplayString = nameDiaplayString;
    }   // For Setter

    public String getUidString() {
        return uidString;
    }

    public void setUidString(String uidString) {
        this.uidString = uidString;
    }

    public String getNameDiaplayString() {
        return nameDiaplayString;
    }

    public void setNameDiaplayString(String nameDiaplayString) {
        this.nameDiaplayString = nameDiaplayString;
    }
}   // Main Class

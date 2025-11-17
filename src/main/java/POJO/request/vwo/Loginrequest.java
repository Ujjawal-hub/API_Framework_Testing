
package POJO.request.vwo;




@SuppressWarnings("unused")
public class Loginrequest {


    private String password;

    private String recaptchaResponseField;

    private Boolean remember;

    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRecaptchaResponseField() {
        return recaptchaResponseField;
    }

    public void setRecaptchaResponseField(String recaptchaResponseField) {
        this.recaptchaResponseField = recaptchaResponseField;
    }

    public Boolean getRemember() {
        return remember;
    }

    public void setRemember(Boolean remember) {
        this.remember = remember;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

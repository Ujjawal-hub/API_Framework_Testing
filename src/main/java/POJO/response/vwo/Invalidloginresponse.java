
package POJO.response.vwo;




@SuppressWarnings("unused")
public class Invalidloginresponse {


    private String captchaKey;

    private String message;

    private Boolean showCaptcha;

    public String getCaptchaKey() {
        return captchaKey;
    }

    public void setCaptchaKey(String captchaKey) {
        this.captchaKey = captchaKey;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getShowCaptcha() {
        return showCaptcha;
    }

    public void setShowCaptcha(Boolean showCaptcha) {
        this.showCaptcha = showCaptcha;
    }

}

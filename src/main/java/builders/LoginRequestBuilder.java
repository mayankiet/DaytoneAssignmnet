package builders;

import entities.request.Login;

public class LoginRequestBuilder {

    private Login login = new Login();

    public LoginRequestBuilder withUserName(String userName) {
        login.setUsername(userName);
        return this;
    }

    public LoginRequestBuilder withGrantType(String grantType){
        login.setGrant_type(grantType);
        return this;
    }

    public LoginRequestBuilder withPassword(String password){
        login.setPassword(password);
        return this;
    }

    public LoginRequestBuilder withScope(String scope){
        login.setScope(scope);
        return this;
    }

    public Login build(){
        return login;
    }
}

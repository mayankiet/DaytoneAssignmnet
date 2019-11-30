package builders;

import entities.request.AddNonAccuring;

public class AddNonAccuringBuilder {

    private AddNonAccuring addNonAccuring = new AddNonAccuring();

    public AddNonAccuringBuilder withName(String name){
        addNonAccuring.setName(name);
        return this;
    }

    public AddNonAccuringBuilder withFromAccount(String fromAccount){
        addNonAccuring.setFromAccount(fromAccount);
        return this;
    }

    public AddNonAccuringBuilder withAccountTypeCode(String accountTypeCode){
        addNonAccuring.setAccountTypeCode(accountTypeCode);
        return this;
    }

    public AddNonAccuringBuilder withAccountNumber(String accountNumber){
        addNonAccuring.setAccountNumber(accountNumber);
        return this;
    }

    public AddNonAccuringBuilder withBankCode(String bankCode){
        addNonAccuring.setBankCode(bankCode);
        return this;
    }

    public AddNonAccuringBuilder withBranchCode(String branchCode){
        addNonAccuring.setBranchCode(branchCode);
        return this;
    }

    public AddNonAccuringBuilder withmsisdn(String msisdn){
        addNonAccuring.setMsisdn(msisdn);
        return this;
    }

    public AddNonAccuringBuilder withreference(String reference){
        addNonAccuring.setReference(reference);
        return this;
    }

    public AddNonAccuringBuilder withownreference(String ownreference){
        addNonAccuring.setOwnReference(ownreference);
        return this;
    }

    public AddNonAccuringBuilder withemail(String email){
        addNonAccuring.setEmail(email);
        return this;
    }

    public AddNonAccuring build() {
        return addNonAccuring;
    }
}

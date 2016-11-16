package com.greenfox.bx;

/**
 * Created by Zsuzska on 2016. 11. 16..
 */
public class CreditCard implements CreditCardy {
    private int sumCVV;
    private String nameCardholder;
    private String codeAccount;

    public CreditCard(int sumCVV, String nameCardholder, String codeAccount) {
        this.sumCVV = (sumCVV==0)?cumeSumCVV(codeAccount):sumCVV;
        this.nameCardholder = nameCardholder;
        this.codeAccount = codeAccount;
    }

    @Override
    public void setSumCVV(int sumCVV) {
        this.sumCVV= sumCVV;
    }

    @Override
    public int getSumCVV() {
        return this.sumCVV;
    }

    @Override
    public void setNameCardholder(String nameCardholder) {

    }

    @Override
    public String getNameCardholder() {
        return nameCardholder;
    }

    @Override
    public void setCodeAccount(String codeAccount) {

    }

    @Override
    public String getCodeAccount() {
        return this.codeAccount;
    }

    @Override
    public int cumeSumCVV(String codeAccount) {
        int sum = 0;
        char c;
        for (int i = 0; i < codeAccount.length()-1; i++) {
            c = codeAccount.charAt(i);
            sum += (c >= '0' && c <= '9') ? Character.getNumericValue(c) : 0;
        }

        return sum;
    }

    @Override
    public boolean ValidCard(String codeAccount, int sumCVV) {
        return (cumeSumCVV(codeAccount) == sumCVV);
    }

    @Override
    public String toString() {
        return String.format("Name=%s CC#=%s CVV=%d", this.nameCardholder, this.codeAccount,this.sumCVV);
    }
}

package Model.MoyenFacturation;

/**
 * Created by Loan on 07/11/2017.
 */
public class ComptePrepaye extends MoyenFacturation {
    float argentDispo;

    public void rechargerCompte(float argent)
    {
        argentDispo = argentDispo + argent;
    }

    public float dechargerCompte(float argent)
    {
        argentDispo = argentDispo - argent;
        if (argentDispo > 0)
        {
            argentDispo = 0;
        }

        return argentDispo;
    }

    public float getArgentDispo() {
        return argentDispo;
    }

    public void setArgentDispo(float argent){
        this.argentDispo = argent;
    }


}

package digitalinnovationone.operacao;
import digitalinnovationone.operacao.internal.DivHelper;
import digitalinnovationone.operacao.internal.MultHelper;
import digitalinnovationone.operacao.internal.SubHelper;
import digitalinnovationone.operacao.internal.SumHelper;


public class Calculadora {

    public int Calculadora(){
    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
        }


    public int sum(int a, int b){
    return sumHelper.execute(a,b);
    }
    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }
    public int div(int a, int b){
        return divHelper.execute(a,b);
    }
    public int div(int a, int b){
        return multHelper.execute(a,b);
    }
    }
}

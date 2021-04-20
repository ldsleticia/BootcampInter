package digitalinnovationone.operacao.internal;

import digitalinnovationone.operacao.Operacao;

public class SumHelper implements Operacao {
    @Override
    public int execute(int a, int b){
        return a + b;
    }
}

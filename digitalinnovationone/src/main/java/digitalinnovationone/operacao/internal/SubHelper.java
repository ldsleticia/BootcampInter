package digitalinnovationone.operacao.internal;

import digitalinnovationone.operacao.Operacao;

public class SubHelper implements Operacao {
    @Override
    public int execute(int a, int b){
        return a - b;
    }
}
package utfpr.ct.dainf.if62c.avaliacao;


/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial 4.
 * @author Fernando
 */
public class AvisoFinal extends Aviso {

    public AvisoFinal(Compromisso compromisso) {
        super(compromisso);
    }
    @Override
        public void run() {
            System.out.println(compromisso.getDescricao() + " começa agora");
            for(Aviso avisoAtual: compromisso.getAvisos()){
                if(avisoAtual == null)
                    continue;
                avisoAtual.cancel();
            }
        }
    
    
}

package acs.cts.ro.decorator2.clase;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(NotaDePlataAbstracta notaDePlataAbstracta) {
        super(notaDePlataAbstracta);
    }

    @Override
    public void afiseazaDetalii1Mai(){
        System.out.println("este 1 mai");
    }
}

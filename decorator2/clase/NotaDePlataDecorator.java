package acs.cts.ro.decorator2.clase;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstracta{
    private NotaDePlataAbstracta notaDePlataAbstracta;

    public NotaDePlataDecorator(NotaDePlataAbstracta notaDePlataAbstracta) {
        this.notaDePlataAbstracta = notaDePlataAbstracta;
    }

    public void afiseazaDetalii() {
        notaDePlataAbstracta.afiseazaDetalii();

    }

    public void afiseazaDetalii1Mai(){
    }

}

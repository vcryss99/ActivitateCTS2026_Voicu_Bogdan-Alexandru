package acs.cts.ro.decorator.clase;

public abstract class Decorator implements NotaDePlataAbstract{
    private NotaDePlataAbstract notaDePlata;

    public Decorator(NotaDePlataAbstract notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }
}

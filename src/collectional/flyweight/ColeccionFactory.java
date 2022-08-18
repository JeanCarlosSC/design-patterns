package collectional.flyweight;

import java.util.ArrayList;

public class ColeccionFactory {
    private static ArrayList<ColeccionFlyweight> flyweights = new ArrayList();

    public static ColeccionFlyweight getFlyweight(CCientifica cCientifica, CLiteraria cLiteraria, CPolitica cPolitica) {
        for(ColeccionFlyweight flyweight: flyweights) {
            if(
                    flyweight.getCCientifica().equals(cCientifica) &&
                            flyweight.getCLiteraria().equals(cLiteraria) &&
                            flyweight.getCPolitica().equals(cPolitica)
            ){
                return flyweight;
            }
        }
        flyweights.add(new ColeccionFlyweight(cCientifica, cLiteraria, cPolitica));
        return flyweights.get(flyweights.size()-1);
    }
}


import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> stallsAndAttractions;

    public ThemePark(String name){
        this.name = name;
        this.stallsAndAttractions = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getStallsAndAttractions(){
        return stallsAndAttractions.size();
    }

    public void addAllReviewed(IReviewed iReviewed){
        if(iReviewed.getRating() > 0) {
           stallsAndAttractions.add(iReviewed);
        }
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.visitAttractions(attraction);
        attraction.increaseVisitCount();
    }
    
}

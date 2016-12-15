package lombok.animals;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import lombok.foods.Food;
import org.joda.time.LocalDate;

import java.util.List;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@Getter
@EqualsAndHashCode
@ToString
public abstract class AbstractAnimal implements Animal {
    private String name;
    @Setter
    private LocalDate birthDate;
    @Setter
    protected List<? extends Animal> children = Lists.newArrayList();
    @Setter
    protected Long movedDistanceInMilliMeters = 0L;
    @Setter
    protected Double happiness;
    @Setter
    protected Long weightInGram;

    public AbstractAnimal(String name, long weightInGram, double happiness) {
        this.name = name;
        this.weightInGram = weightInGram;
        this.happiness = happiness;
        this.birthDate = new LocalDate();
    }

    public void move(long distanceInMilliMeters) {
        this.movedDistanceInMilliMeters = this.movedDistanceInMilliMeters.longValue() + distanceInMilliMeters;
        this.happiness = this.happiness.doubleValue() - this.getMoveHappinessDecrease();
        this.weightInGram = this.weightInGram.longValue() - distanceInMilliMeters;
    }

    protected void feed(Food food) {
        this.weightInGram = this.weightInGram + food.getCalories();
        this.happiness = this.happiness + food.getWeight() * food.getQualityMultiplier();
    }

    protected abstract int getMoveHappinessDecrease();

    public ImmutableList<? extends Animal> getChildren() {
        return ImmutableList.copyOf(this.children);
    }

    public Integer getChildrenNumber() {
        return this.children.size();
    }
}

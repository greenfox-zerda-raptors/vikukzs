package lombok.foods;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@ToString(callSuper = true)
@EqualsAndHashCode
public class Cheese extends AbstractFood {
    protected Cheese(Long weight, Long calories, Float qualityMultiplier) {
        super("Cheese", weight, calories, qualityMultiplier);
    }

    public static Cheese.CheeseBuilder builder() {
        return new Cheese.CheeseBuilder();
    }

    public static class CheeseBuilder {
        private Long weight;
        private Long calories;
        private Float qualityMultiplier;

        CheeseBuilder() {
        }

        public Cheese.CheeseBuilder weight(Long weight) {
            this.weight = weight;
            return this;
        }

        public Cheese.CheeseBuilder calories(Long calories) {
            this.calories = calories;
            return this;
        }

        public Cheese.CheeseBuilder qualityMultiplier(Float qualityMultiplier) {
            this.qualityMultiplier = qualityMultiplier;
            return this;
        }

        public Cheese build() {
            return new Cheese(this.weight, this.calories, this.qualityMultiplier);
        }

    }
}

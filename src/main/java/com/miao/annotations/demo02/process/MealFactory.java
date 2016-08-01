package com.miao.annotations.demo02.process;

import com.miao.annotations.demo02.domain.CalzonePizza;
import com.miao.annotations.demo02.domain.MargheritaPizza;
import com.miao.annotations.demo02.domain.Meal;
import com.miao.annotations.demo02.domain.Tiramisu;

/**
 * Meal工厂
 *
 */
public class MealFactory {
    public Meal create(String id) {
        if (id == null) {
            throw new IllegalArgumentException("id is null!");
        }
        if ("Calzone".equals(id)) {
            return new CalzonePizza();
        }

        if ("Tiramisu".equals(id)) {
            return new Tiramisu();
        }

        if ("Margherita".equals(id)) {
            return new MargheritaPizza();
        }

        throw new IllegalArgumentException("Unknown id = " + id);
    }
}

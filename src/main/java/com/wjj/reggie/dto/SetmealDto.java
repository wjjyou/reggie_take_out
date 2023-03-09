package com.wjj.reggie.dto;

import com.wjj.reggie.entity.Setmeal;
import com.wjj.reggie.entity.SetmealDish;
import com.wjj.reggie.entity.Setmeal;
import com.wjj.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}

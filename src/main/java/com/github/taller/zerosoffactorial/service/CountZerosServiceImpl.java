package com.github.taller.zerosoffactorial.service;

import com.github.taller.zerosoffactorial.data.Result;
import org.springframework.stereotype.Service;

@Service("countZerosService")
public class CountZerosServiceImpl implements CountZerosService {


    @Override
    public Result countZerosOfFactorialFrom(int num) {
        int result = 0;

        while (num > 0) {
            num /= 5;
            result += num;
        }

        return new Result(result);
    }
}

package com.github.taller.zerosoffactorial.service;

import com.github.taller.zerosoffactorial.data.Result;
import org.springframework.stereotype.Service;

@Service("countZerosService")
public class CountZerosServiceImpl implements CountZerosService {


    @Override
    public Result countZerosOfFactorialFrom(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("num should be greater than 0.");
        }

        Result result = calculateZeros(num);

        return result;
    }

    private Result calculateZeros(int num) {
        int result = 0;

        while (num > 0) {
            num /= 5;
            result += num;
        }

        return new Result(result);
    }
}

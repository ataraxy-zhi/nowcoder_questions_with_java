package com.solution.huaweimachinetest.introduction.taketheapproximatevalue;

import java.util.Scanner;

/**
 * @ClassName Main
 * @Description 题目描述
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * <p>
 * 输入描述:
 * 输入一个正浮点数值
 * <p>
 * 输出描述:
 * 输出该数值的近似整数值
 * <p>
 * 示例1
 * 输入
 * 复制
 * 5.5
 * 输出
 * 复制
 * 6
 * @Author
 * @Date 2021/3/15 10:19
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextDouble()) {
            double num = scan.nextDouble();
            int num1 = (int) num;

            if ((num - num1) >= 0.5) {
                num1++;
            }

            System.out.println(num1);
        }

    }
}

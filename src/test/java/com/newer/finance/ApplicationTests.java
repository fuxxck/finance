package com.newer.finance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {
        int[] all={1,3,5,10,12,19,7};
        //冒泡前数组
        for (int num:all){
            System.out.println("冒泡前数组"+num);
        }
        for (int i=0;i<all.length-1;i++){
            for (int j=0;j<all.length-1-i;j++){
                //大放右
if (all[j]>all[j+1]){
    int temp=all[j];
    all[j]=all[j+1];
    all[j+1]=temp;
}
                }
            }
       for (int num:all){
           System.out.println(num);
       }
       
        }


    }




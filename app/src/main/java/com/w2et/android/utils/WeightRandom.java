package com.w2et.android.utils;
/*
 *  Date: 2020/1/10
 *  Author: chiyu.Shi
 *  Project: W2et
 *  Description:
 */

import com.w2et.android.model.WeightNode;

import java.util.LinkedList;

public class WeightRandom {
    public static LinkedList GetChooseList(LinkedList<WeightNode> nodes){
        //进行权重筛选，低于1的直接舍弃
        for(WeightNode node : nodes){
            if(node.getWeight() <= 0){
                nodes.remove(node);
            }
        }
        return nodes;
    }

}

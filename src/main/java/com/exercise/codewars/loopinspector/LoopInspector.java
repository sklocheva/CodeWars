package com.exercise.codewars.loopinspector;

import com.exercise.codewars.loopinspector.helper.Node;

import java.util.ArrayList;
import java.util.List;

public class LoopInspector {

    public int loopSize(Node node) {

        List<Node> nodeList = new ArrayList<Node>();
        //add first node
        nodeList.add(node);
        while(node != null)
        {
            node = node.getNext();
            //if node already contained in list - end of the loop
            if(nodeList.contains(node))
            {
                return nodeList.size() - nodeList.indexOf(node);
            }
            nodeList.add(node);
        }
        //no loop
        return 0;
    }
}
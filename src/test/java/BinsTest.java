

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BinsTest {


    Bins bin = new Bins(2);
    int noOfDies = 2;
    Map<Integer,Integer> map = new HashMap<Integer, Integer>();

    @Test
    public void testIncrementBins(){
        int toss =2;
        int expected = 1;

        bin.IncrementBin(2);
        int actual = bin.getBin(toss);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCreateBins(){
        for(int i=noOfDies; i<=noOfDies*6;i++)
        {
            map.put(i,0);
        }
        Assert.assertEquals(map, bin.getBins());
    }

   @Test
    public void testGetBins(){
        map.put(2,0);
        int expected = 0;
        int actual = bin.getBin(2);
        Assert.assertEquals(expected, actual);
   }





}
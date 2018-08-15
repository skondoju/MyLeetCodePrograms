package com.programs.common;

import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by Sireesha on 11/13/17.
 */
public class Intersection {

    public int[] arrayIntersection(int[] nums1, int[] nums2) {

       // int[] smallArray = nums1.length <= nums2.length ? nums1 : nums2;
        //int[] largeArray = nums1.length > nums2.length ? nums1 : nums2;


        Set<Integer> nums1Set = new HashSet<Integer>();
        Set<Integer> nums2Set = new HashSet<Integer>();

        int[] intersectionArray ;
        ArrayList<Integer> alist =  new ArrayList<Integer>();

        if (nums1 != null && nums2 != null && nums1.length > 0 && nums2.length > 0) {


            for (int i = 0; i < nums1.length; i++) {
                nums1Set.add(nums1[i]);
            }

            for (int i = 0; i < nums2.length; i++) {
                nums2Set.add(nums2[i]);
            }



            //int minLen = Math.min(nums1Set.size(), nums2Set.size());
             //intersectionArray = new int[minLen];
            int index = 0;


            if (nums1Set.size() <= nums2Set.size()) {

                for (int i : nums1Set) {

                    if (nums2Set.contains(i)) {

                        //intersectionArray[index++] = i;
                        alist.add(i);
                    }

                }
            } else if (nums1Set.size() > nums2Set.size()) {

                for (int i : nums2Set) {

                    if (nums1Set.contains(i)) {

                       // intersectionArray[index++] = i;
                        alist.add(i);

                    }

                }
            } else {

                for (int i : nums2Set) {

                    if (nums1Set.contains(i)) {

                        //intersectionArray[index++] = i;
                        alist.add(i);

                    }

                }
            }

        }

         intersectionArray = new int[alist.size()];
        for (int i = 0; i< alist.size(); i++) {
            intersectionArray[i] = alist.get(i);
        }

        return intersectionArray;

    }


    }


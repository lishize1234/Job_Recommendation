package com.laioffer.job.servlet;

import com.laioffer.job.external.MonkeyLearnClient;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class SImpleTest {
    public static void main(String[] args){
        List<String> articles = Arrays.asList("Elon Musk has shared a photo of the spacesuit designed by SpaceX. This is the second image shared of the new design and the first to feature the spacesuit’s full-body look.",
                "Former Auburn University football coach Tommy Tuberville defeated ex-US Attorney General Jeff Sessions in Tuesday nights runoff for the Republican nomination for the U.S. Senate. ",
                "The NEOWISE comet has been delighting skygazers around the world this month – with photographers turning their lenses upward and capturing it above landmarks across the Northern Hemisphere."
        );
        MonkeyLearnClient client = new MonkeyLearnClient();
        List<Set<String>> keywordList = client.extract(articles);
        System.out.println(keywordList);
    }
}

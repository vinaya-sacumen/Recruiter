package com.recruiter.recruiter;

public class Configurer {
    Recruiter r;

    public  Configurer(Recruiter r) {
        this.r = r;
    }

    public int test()
    {
        int w=r.add(2,3);
        return w;
    }
}

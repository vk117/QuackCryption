public class SingleStep {
    public String toAES(String key, String initVector, String str1) {
        return AES.encrypt(key, initVector, str1);
    }

    public String fromAES(String key, String initVector, String str2) {
        return AES.decrypt(key, initVector, str2);
    }

    public String toQuack(String str3) {
        return Quack.quackCrypt(str3);
    }

    public String fromQuack(String str4) {
        return Quack.quackReader(str4);
    }

    public String throughQuack(String key, String initVector, String str5) {
        return toQuack(toAES(key, initVector, str5));
    }

    public String throughNormal(String key, String initVector, String str6) {
        return fromAES(key, initVector, fromQuack(str6));
    }

    public static void main(String[] args) {
        SingleStep ss = new SingleStep();
        System.out.println(ss.fromAES("QuackQuackQuack!", "RandomInitVector", "t+mWWUOYRbqmJoupaZc9xg==wLt3vZBytFzWR6nmO8E/+g==t+mWWUOYRbqmJoupaZc9xg==aCL6UjJTDzEDSHCl3au/qg==sijLvfrBxRTPzgSfgnT6uw==/m93ShEACb6p8Jk6I995ew==zOa/RuRcEYv9wF0320TNlQ==CA8vuseha17pEE1r+iaCcw==lLKlt8g8UYuGoiiF83VI8A==CA8vuseha17pEE1r+iaCcw==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==lwyzBUsm52mOPKfwoZiqjg==sijLvfrBxRTPzgSfgnT6uw==lwyzBUsm52mOPKfwoZiqjg==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==t+mWWUOYRbqmJoupaZc9xg==gbsdHYyk9tjX/JwrvseQzg==sijLvfrBxRTPzgSfgnT6uw==kRlJah++n45x0RyWmjxVkg==mNSzVWDFxdY+HLwR3uwy3A==F4jjRWPObeM3BPo/wZciSg==ZARBM+FCLim6CnjKUqXiMA==+X6PTr5mBh9E/srP8g06ZQ==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==mxa1psp+gzljMkwPGFoGhQ==mxa1psp+gzljMkwPGFoGhQ==sijLvfrBxRTPzgSfgnT6uw==VkeUjhePSZ/1shY8pFBsQg==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==1gG1Zt1H8nu3WL/fUapYEQ==sijLvfrBxRTPzgSfgnT6uw==wQ/CcBWCKlgxRC0qDKQ2HA==Ry+VsoMaFs03yboS0xuqzQ==e7Iq9ADHrKQEIaTS9C+FlA==sijLvfrBxRTPzgSfgnT6uw==iIrDIJE+H6Ly9SUTlBu1Ww==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==L12zt1crCUjcuFb+D+K6RA==ZARBM+FCLim6CnjKUqXiMA==sijLvfrBxRTPzgSfgnT6uw==0/bEUXXlQlO+apnvVrzyzw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==IUQQhrQiOPBsahhzOUEwTA==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==iIrDIJE+H6Ly9SUTlBu1Ww==hszuq5n4poyABHe8FzLP1g==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==iIrDIJE+H6Ly9SUTlBu1Ww==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==hszuq5n4poyABHe8FzLP1g==wQ/CcBWCKlgxRC0qDKQ2HA==sijLvfrBxRTPzgSfgnT6uw==0/bEUXXlQlO+apnvVrzyzw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==MGF6UjnM6C2oKU008GUaWA==hszuq5n4poyABHe8FzLP1g==iIrDIJE+H6Ly9SUTlBu1Ww==sijLvfrBxRTPzgSfgnT6uw==0/bEUXXlQlO+apnvVrzyzw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==MGF6UjnM6C2oKU008GUaWA==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==t+mWWUOYRbqmJoupaZc9xg==RReMNjqgS2SC9QmIqsRGHw==sijLvfrBxRTPzgSfgnT6uw==hTchZSY3F0Yggk1eCsyGgw==J+qgnxxiVcbIJ3GJgyb8Zg==JklBynJ+ooYQ0Pte3M9S+Q==c+PLScwpqRaHU/jGX0pKbA==vu+ECcf+fqGMJX/FeQoteQ==c+PLScwpqRaHU/jGX0pKbA==gEypp4g2n51Qy5N6OJimXw==JklBynJ+ooYQ0Pte3M9S+Q==c+PLScwpqRaHU/jGX0pKbA==7R0KGCNaeW+OSmmTerE48Q==/VJQE/5sJZubwzaYoEEzBQ==IYhOfir00B+P01+Vc0v7lQ==A3SUJ/5XaNbwaDRFf3e5Cg==ENUtsp7S2qgzy8/atIar9A==sijLvfrBxRTPzgSfgnT6uw==hTchZSY3F0Yggk1eCsyGgw==p0niDUzzjSHl9cgHiEFoDQ==lLKlt8g8UYuGoiiF83VI8A==mxa1psp+gzljMkwPGFoGhQ==0/bEUXXlQlO+apnvVrzyzw==0/bEUXXlQlO+apnvVrzyzw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==hTchZSY3F0Yggk1eCsyGgw==p0niDUzzjSHl9cgHiEFoDQ==lLKlt8g8UYuGoiiF83VI8A==mxa1psp+gzljMkwPGFoGhQ==0/bEUXXlQlO+apnvVrzyzw==x8mOoZscTxBPi1sop1YJtQ==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==/m93ShEACb6p8Jk6I995ew==vXFz03P9eCJLk4yy7Bz+yQ==SLzOV9kGckn4vrRHRQEn/w==AlgeFa+dqC0DOqH0T5JlTQ==tuj36VB+2HBvMESlvVfDjw==mPeIw64qdyfnCXx85tjNnQ==sijLvfrBxRTPzgSfgnT6uw==oDUo5cC7bmb5hLWjcxe/oQ==0/bEUXXlQlO+apnvVrzyzw==GOyz8YbufR+PmvjDEmaYWw==OP6DqGC9Y5Lg/bXwK88R8A==Bq+Z2Btm0IQoqxge3xnptg==ZXh17MKo16oBQs2kMctP3Q==L0SpBaFWX5/ozzDXd7vomw==GpleEYoTk9KxT0BPnGT99w==p0niDUzzjSHl9cgHiEFoDQ==SIIKP5Pmk/YZo16nJ8bBfQ==t+mWWUOYRbqmJoupaZc9xg==l3p38qw7MFyBKVoH1fIGTA==sijLvfrBxRTPzgSfgnT6uw==5hkTq//ay5mMUgXkpep4RA==1gG1Zt1H8nu3WL/fUapYEQ==sijLvfrBxRTPzgSfgnT6uw==MGF6UjnM6C2oKU008GUaWA==sijLvfrBxRTPzgSfgnT6uw==MGF6UjnM6C2oKU008GUaWA==iIrDIJE+H6Ly9SUTlBu1Ww==Ry+VsoMaFs03yboS0xuqzQ==3WWYvYoplpJZlT+Mj4BxRg==sijLvfrBxRTPzgSfgnT6uw==wQ/CcBWCKlgxRC0qDKQ2HA==5hkTq//ay5mMUgXkpep4RA==Ry+VsoMaFs03yboS0xuqzQ==iIrDIJE+H6Ly9SUTlBu1Ww==5hkTq//ay5mMUgXkpep4RA==Ry+VsoMaFs03yboS0xuqzQ==t+mWWUOYRbqmJoupaZc9xg==DiqCyF8PhLQj/gi1+GT2sQ==sijLvfrBxRTPzgSfgnT6uw==4/e2BTHCvYwk5X8YkxVyTw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==IJSnxhOGLGbqsYoe0B6bcg==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==wQ/CcBWCKlgxRC0qDKQ2HA==iIrDIJE+H6Ly9SUTlBu1Ww==0/bEUXXlQlO+apnvVrzyzw==IJSnxhOGLGbqsYoe0B6bcg==QyTmlq8MUjmMkg9aE53VjA==4tqeJxNtcbOwIfFzJRfp1w==1gG1Zt1H8nu3WL/fUapYEQ==Bq+Z2Btm0IQoqxge3xnptg==kpaJ6Ns/cYrn4CG3dKwsgg==CKlpu3NGtHM2DzeAbdHlvw==t+mWWUOYRbqmJoupaZc9xg==DiqCyF8PhLQj/gi1+GT2sQ==sijLvfrBxRTPzgSfgnT6uw==i0w9qGy/ULuMZEz5vajqqA==/m93ShEACb6p8Jk6I995ew==sijLvfrBxRTPzgSfgnT6uw==wQ/CcBWCKlgxRC0qDKQ2HA==Ry+VsoMaFs03yboS0xuqzQ==iIrDIJE+H6Ly9SUTlBu1Ww==iIrDIJE+H6Ly9SUTlBu1Ww==wQ/CcBWCKlgxRC0qDKQ2HA==0/bEUXXlQlO+apnvVrzyzw==iIrDIJE+H6Ly9SUTlBu1Ww==IJSnxhOGLGbqsYoe0B6bcg==IJSnxhOGLGbqsYoe0B6bcg==0/bEUXXlQlO+apnvVrzyzw==0/bEUXXlQlO+apnvVrzyzw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==+lWPxgijQ0hLj10Pty7F+A==Ry+VsoMaFs03yboS0xuqzQ==wQ/CcBWCKlgxRC0qDKQ2HA==iIrDIJE+H6Ly9SUTlBu1Ww==sijLvfrBxRTPzgSfgnT6uw==0/bEUXXlQlO+apnvVrzyzw==5hkTq//ay5mMUgXkpep4RA==IJSnxhOGLGbqsYoe0B6bcg==e7Iq9ADHrKQEIaTS9C+FlA==QQKzr3neVO6qqV7/urfPJQ==ivwhdHDnDBk4Yvp17QOKOQ==Wc5JvrC6jMroG6moGFWrMg==QyTmlq8MUjmMkg9aE53VjA==Yfzkk056ofRSkuKTO1796g==jC7sZpFt5zW3HPqx/n21pw==dKF9nXyIHsv7XfInH9fgrw==4tqeJxNtcbOwIfFzJRfp1w==3WWYvYoplpJZlT+Mj4BxRg==WVz+0tSLB6QYJMMPnErS2Q==UdyUqa2mN5LEir55fZ5jDA==kBlE8AG+/b5yXS+DKwyKqg==hS4y1Enb4EpxxSx2FtSJcQ==yNVSh9cMYQTVYVT+0RQosw==0/13nJPHOZOBWjvbo2oYPA==1gG1Zt1H8nu3WL/fUapYEQ==d+ivq2loUijlbHB5jff8+w==p0niDUzzjSHl9cgHiEFoDQ==Aa60gBK8iFCLrZ8zLqPB2Q==kkqGSJ+VqU268eUMsiZkrA==vkpiRk6/CmNkP9UCXaV2aQ==5mXs1Idq9STeSXF2p6dqMQ==d+qaMGimMCiZu9C/3BYHPw==LPzUy9Z6rRuko58w1am/Ig==yLvBM2bM1u2ExjvsI70GpA==IYhOfir00B+P01+Vc0v7lQ==Yr+Isr8l7a9RMu1grosj7g==AtJH9f75EcGbZXoT/WWJ2w==WP+ckxhZb+mefpkE+FzNJg==Bq+Z2Btm0IQoqxge3xnptg==kpaJ6Ns/cYrn4CG3dKwsgg==ofspVyxJDt/AoOXkdnhzHQ==lsNZXS1D4Q3mXgy5KSubAQ==+to+OaE6ePtX9glSR9DrDw==MGF6UjnM6C2oKU008GUaWA==wFXWdZ6+PjiskdSE2MfZQw==x8mOoZscTxBPi1sop1YJtQ==IUQQhrQiOPBsahhzOUEwTA==NdQdgFd613wAZdQ0se9t/w==2YwkQugt9mt1C9jzGhX+Ag==5JbQkECK6/hqhhdwMXeNdg==VkeUjhePSZ/1shY8pFBsQg==rXNHLRdQJUY4H1xqXNEOgQ==G4xodcItfcxVZDsIEH5ujg==U/aZDl7n1x7xI+B4c869jQ==vGZYL2hukrh3pGh0lkWGDw==hTchZSY3F0Yggk1eCsyGgw==QlgzyxxCRmlKLnyPThnSaQ==S3Qp+27zyg6l4l1pHsV/hA==bt4UmPtDi/4OZghKtiwevQ==gCukLMpiyy3aWKUv5tTr7g==mNSzVWDFxdY+HLwR3uwy3A==CA8vuseha17pEE1r+iaCcw==PcMmXPIdAi2KDJxppvFF7Q==lwyzBUsm52mOPKfwoZiqjg==lLKlt8g8UYuGoiiF83VI8A==zOa/RuRcEYv9wF0320TNlQ==M9HLJirreghnkb7i7ZF18A==N8C7EG42KtWdHqQANUaPFg==uISHbejECiYhyb55dTgu0g==mP52gA+O4mkclBmDvySBgQ==/WgnMYvNFKugLCqbOA1wEw==kRlJah++n45x0RyWmjxVkg==xAaG0l9BC6mNhOoV13e3zA==/Gw4VRPKIMh+piecEhZeng==l0VAz8jU8VWyUXQs/m3+eQ==pAVsz8HOirkCAplMa+LyOQ==0VM8ls7oIZ0M6KCLS6OcBw==+X6PTr5mBh9E/srP8g06ZQ==7hMahlpAIMhXD/dOXlmzNA==JklBynJ+ooYQ0Pte3M9S+Q==ZARBM+FCLim6CnjKUqXiMA==m/3F07fzo4q1nqq72x+Emw==gEypp4g2n51Qy5N6OJimXw==vu+ECcf+fqGMJX/FeQoteQ==+NZhCzeUMgNFNoOH3fHecw==LM6FiB422VnpGo1wha9fjw==ShTMcl+LtjxfUPdkowvz2w==F4jjRWPObeM3BPo/wZciSg==MCWFWyu2dATCnLsTBlro4A==dma88Zbp71Ay2nTVhIR47Q==crMjcP1xu9/sg1129m+t1w==DQmnz0a5mQMiuEL51SGmeA==/rlB0irM3gGyk/9H+rUFbw==Gpqp4F1zqZh2OkwMjubb/Q==L12zt1crCUjcuFb+D+K6RA==TrMdO2x4Vv8TqUZzqs6Z7g==rJuruEe6e0BHiSY1/SUaVQ==ZNQLm4fATg9yO0Zqakbhdg==HOAJwnTejUrjCq/N6o2D3w==0yvsfvdCu1kMjJAc86GqAw==sFbNEytYLfmqNMvQnsUJlg==SpYghzXj6AIZtRyxpLP89g==O9S5m1Wj1wx2LEmafxIvFg==h8aKLeANomdcO2PjO3Cq5g==ZXh17MKo16oBQs2kMctP3Q==hmneyLjQNmUQdrNFFXH9AA==PNCSpQERyO9ieSssl66zQA==znUI99lKWYsTgxoTOzb2YA==k9pDTEOQc4nx6jHzNvgvBA==zVhUdfup/IiAHnMeWbm0KA==WAUDPM5WnOYiG818ggK7AA==WZDse0v+iFEulH9melwXcA==PKrPaVAIqbRCqNlxRrttWw==IlASqRZ5lwfUPQl0NKjTLQ==33hyfXiH09FcxPcEUYIVhw==Odr2raytV+rScXs5Afgptg==oDUo5cC7bmb5hLWjcxe/oQ==KFZnrMSAFpHElZdpYFhVpA==H5rXM3i+4CqhyRnqtAb18A==i0w9qGy/ULuMZEz5vajqqA==emidHT8Iiw1kS0usJIp7HA==5kSZyyUdUtX3ebYQSgBH6w==mE53cjN0tNgd0fsIYtNhlA==jDfBEzrRgsSap3pn9dEMDQ==/T6aFYLS2bMm9K12l2kn6A==la7CDshkaupq97Hzo+DpXg==XVoiMOaheJp+oVE+wMnJPw==DiqCyF8PhLQj/gi1+GT2sQ==lYlbCYF/aIhQADTxcBqCew==URHre2I4piJ0mg71aEIosQ==TJk4Oh6tgphBqfvntlcM/A==k6x0Ax/ywv4QS0MXNNr+ow==aCYdkkzgoAFmCIbmdiHXDw==jRHWFhbymCSg28jYVYGodQ==namc1XAnmx8IAklYR1bY6A==fe/pvrCaau2wbPMDZsebSQ==vXFz03P9eCJLk4yy7Bz+yQ==w88Fr90ltV5UTwFo+HqobA==v+2mruy0vIhAKtnHDf25Mw==CayfwWWKjZdbzrQMoQ6A9w==wLt3vZBytFzWR6nmO8E/+g==tuj36VB+2HBvMESlvVfDjw==qONvLQH7NdDFBg538CtL7w==gbsdHYyk9tjX/JwrvseQzg==tKRnwVATUPzR1TBPI+CaOg==A69mVgsn3iiX3Ho01OvM4g==HiRKufp+di3P7fKy5Ff/YQ==isZj8bEPhh7wxSeeRVPlQQ==bb+ggsFlww30mraEM1zStA==uTvY2JT6gFAfx450QnJJbA==GOAaE+De2H6qsDfL8MH6dA==GOyz8YbufR+PmvjDEmaYWw==0VNwlYx9ZMMDNHeCVMmy/Q==uQ/At/nb24DFZDa5YdEs8A==6HbvKXy+CFik5NGM21btUw==XEByWN5d5sYIMRGJmR3BSg==t+ikE9JCjIWIULgEVctIGg==WHsXfcgHXaqMXC509vyXGg==RMusrOeInpJVEaOCTjSDpQ==SGAze9Mpe6rG46xaOFRttQ==GpleEYoTk9KxT0BPnGT99w==lNBXW1EC5uR0+h2rUWsiAQ==dH299HmQm6lMySyGaPa4RA==t+mWWUOYRbqmJoupaZc9xg==DiqCyF8PhLQj/gi1+GT2sQ==sijLvfrBxRTPzgSfgnT6uw==4/e2BTHCvYwk5X8YkxVyTw==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==iIrDIJE+H6Ly9SUTlBu1Ww==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==wQ/CcBWCKlgxRC0qDKQ2HA==iIrDIJE+H6Ly9SUTlBu1Ww==0/bEUXXlQlO+apnvVrzyzw==IJSnxhOGLGbqsYoe0B6bcg==QyTmlq8MUjmMkg9aE53VjA==4tqeJxNtcbOwIfFzJRfp1w==1gG1Zt1H8nu3WL/fUapYEQ==Bq+Z2Btm0IQoqxge3xnptg==kpaJ6Ns/cYrn4CG3dKwsgg==CKlpu3NGtHM2DzeAbdHlvw==t+mWWUOYRbqmJoupaZc9xg==DiqCyF8PhLQj/gi1+GT2sQ==sijLvfrBxRTPzgSfgnT6uw==i0w9qGy/ULuMZEz5vajqqA==5hkTq//ay5mMUgXkpep4RA==sijLvfrBxRTPzgSfgnT6uw==wQ/CcBWCKlgxRC0qDKQ2HA==Ry+VsoMaFs03yboS0xuqzQ==wQ/CcBWCKlgxRC0qDKQ2HA==0/bEUXXlQlO+apnvVrzyzw==0/bEUXXlQlO+apnvVrzyzw==iIrDIJE+H6Ly9SUTlBu1Ww==0/bEUXXlQlO+apnvVrzyzw==4tqeJxNtcbOwIfFzJRfp1w==IJSnxhOGLGbqsYoe0B6bcg==0/bEUXXlQlO+apnvVrzyzw==0/bEUXXlQlO+apnvVrzyzw==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==wQ/CcBWCKlgxRC0qDKQ2HA==ShTMcl+LtjxfUPdkowvz2w==sijLvfrBxRTPzgSfgnT6uw==Ry+VsoMaFs03yboS0xuqzQ==wQ/CcBWCKlgxRC0qDKQ2HA==iIrDIJE+H6Ly9SUTlBu1Ww==5hkTq//ay5mMUgXkpep4RA==0/bEUXXlQlO+apnvVrzyzw==IJSnxhOGLGbqsYoe0B6bcg==QQKzr3neVO6qqV7/urfPJQ==ivwhdHDnDBk4Yvp17QOKOQ==QyTmlq8MUjmMkg9aE53VjA==e7Iq9ADHrKQEIaTS9C+FlA==Wc5JvrC6jMroG6moGFWrMg==jC7sZpFt5zW3HPqx/n21pw==4tqeJxNtcbOwIfFzJRfp1w==dKF9nXyIHsv7XfInH9fgrw==WVz+0tSLB6QYJMMPnErS2Q==Yfzkk056ofRSkuKTO1796g==3WWYvYoplpJZlT+Mj4BxRg==kBlE8AG+/b5yXS+DKwyKqg==hS4y1Enb4EpxxSx2FtSJcQ==1gG1Zt1H8nu3WL/fUapYEQ==UdyUqa2mN5LEir55fZ5jDA==p0niDUzzjSHl9cgHiEFoDQ==yNVSh9cMYQTVYVT+0RQosw==0/13nJPHOZOBWjvbo2oYPA==Aa60gBK8iFCLrZ8zLqPB2Q==kkqGSJ+VqU268eUMsiZkrA==Bq+Z2Btm0IQoqxge3xnptg==d+ivq2loUijlbHB5jff8+w==IYhOfir00B+P01+Vc0v7lQ==5mXs1Idq9STeSXF2p6dqMQ==LPzUy9Z6rRuko58w1am/Ig==vkpiRk6/CmNkP9UCXaV2aQ==Yr+Isr8l7a9RMu1grosj7g==AtJH9f75EcGbZXoT/WWJ2w==d+qaMGimMCiZu9C/3BYHPw==kpaJ6Ns/cYrn4CG3dKwsgg==ofspVyxJDt/AoOXkdnhzHQ==yLvBM2bM1u2ExjvsI70GpA==rXNHLRdQJUY4H1xqXNEOgQ==gbsdHYyk9tjX/JwrvseQzg==x8mOoZscTxBPi1sop1YJtQ==uQ/At/nb24DFZDa5YdEs8A==lsNZXS1D4Q3mXgy5KSubAQ==+to+OaE6ePtX9glSR9DrDw==MGF6UjnM6C2oKU008GUaWA==wFXWdZ6+PjiskdSE2MfZQw==IUQQhrQiOPBsahhzOUEwTA==NdQdgFd613wAZdQ0se9t/w==2YwkQugt9mt1C9jzGhX+Ag==5JbQkECK6/hqhhdwMXeNdg==VkeUjhePSZ/1shY8pFBsQg==G4xodcItfcxVZDsIEH5ujg==U/aZDl7n1x7xI+B4c869jQ==vGZYL2hukrh3pGh0lkWGDw==hTchZSY3F0Yggk1eCsyGgw==QlgzyxxCRmlKLnyPThnSaQ==S3Qp+27zyg6l4l1pHsV/hA==bt4UmPtDi/4OZghKtiwevQ==gCukLMpiyy3aWKUv5tTr7g==mNSzVWDFxdY+HLwR3uwy3A==CA8vuseha17pEE1r+iaCcw==PcMmXPIdAi2KDJxppvFF7Q==lwyzBUsm52mOPKfwoZiqjg==lLKlt8g8UYuGoiiF83VI8A==zOa/RuRcEYv9wF0320TNlQ==M9HLJirreghnkb7i7ZF18A==N8C7EG42KtWdHqQANUaPFg==uISHbejECiYhyb55dTgu0g==mP52gA+O4mkclBmDvySBgQ==/WgnMYvNFKugLCqbOA1wEw==kRlJah++n45x0RyWmjxVkg==xAaG0l9BC6mNhOoV13e3zA==/Gw4VRPKIMh+piecEhZeng==l0VAz8jU8VWyUXQs/m3+eQ==pAVsz8HOirkCAplMa+LyOQ==0VM8ls7oIZ0M6KCLS6OcBw==+X6PTr5mBh9E/srP8g06ZQ==7hMahlpAIMhXD/dOXlmzNA==JklBynJ+ooYQ0Pte3M9S+Q==ZARBM+FCLim6CnjKUqXiMA==m/3F07fzo4q1nqq72x+Emw==gEypp4g2n51Qy5N6OJimXw==vu+ECcf+fqGMJX/FeQoteQ==+NZhCzeUMgNFNoOH3fHecw==LM6FiB422VnpGo1wha9fjw==ShTMcl+LtjxfUPdkowvz2w==F4jjRWPObeM3BPo/wZciSg==MCWFWyu2dATCnLsTBlro4A==dma88Zbp71Ay2nTVhIR47Q==WP+ckxhZb+mefpkE+FzNJg==crMjcP1xu9/sg1129m+t1w==DQmnz0a5mQMiuEL51SGmeA==/rlB0irM3gGyk/9H+rUFbw==Gpqp4F1zqZh2OkwMjubb/Q==L12zt1crCUjcuFb+D+K6RA==TrMdO2x4Vv8TqUZzqs6Z7g==rJuruEe6e0BHiSY1/SUaVQ==ZNQLm4fATg9yO0Zqakbhdg==HOAJwnTejUrjCq/N6o2D3w==0yvsfvdCu1kMjJAc86GqAw==sFbNEytYLfmqNMvQnsUJlg==SpYghzXj6AIZtRyxpLP89g==O9S5m1Wj1wx2LEmafxIvFg==h8aKLeANomdcO2PjO3Cq5g==ZXh17MKo16oBQs2kMctP3Q==hmneyLjQNmUQdrNFFXH9AA==PNCSpQERyO9ieSssl66zQA==znUI99lKWYsTgxoTOzb2YA==k9pDTEOQc4nx6jHzNvgvBA==zVhUdfup/IiAHnMeWbm0KA==WAUDPM5WnOYiG818ggK7AA==WZDse0v+iFEulH9melwXcA==PKrPaVAIqbRCqNlxRrttWw==IlASqRZ5lwfUPQl0NKjTLQ==33hyfXiH09FcxPcEUYIVhw==Odr2raytV+rScXs5Afgptg==oDUo5cC7bmb5hLWjcxe/oQ==KFZnrMSAFpHElZdpYFhVpA==H5rXM3i+4CqhyRnqtAb18A==i0w9qGy/ULuMZEz5vajqqA==emidHT8Iiw1kS0usJIp7HA==5kSZyyUdUtX3ebYQSgBH6w==mE53cjN0tNgd0fsIYtNhlA==jDfBEzrRgsSap3pn9dEMDQ==/T6aFYLS2bMm9K12l2kn6A==la7CDshkaupq97Hzo+DpXg==XVoiMOaheJp+oVE+wMnJPw==DiqCyF8PhLQj/gi1+GT2sQ==lYlbCYF/aIhQADTxcBqCew==URHre2I4piJ0mg71aEIosQ==TJk4Oh6tgphBqfvntlcM/A==k6x0Ax/ywv4QS0MXNNr+ow==aCYdkkzgoAFmCIbmdiHXDw==jRHWFhbymCSg28jYVYGodQ==namc1XAnmx8IAklYR1bY6A==fe/pvrCaau2wbPMDZsebSQ==vXFz03P9eCJLk4yy7Bz+yQ==w88Fr90ltV5UTwFo+HqobA==v+2mruy0vIhAKtnHDf25Mw==CayfwWWKjZdbzrQMoQ6A9w==wLt3vZBytFzWR6nmO8E/+g==tuj36VB+2HBvMESlvVfDjw==qONvLQH7NdDFBg538CtL7w==tKRnwVATUPzR1TBPI+CaOg==A69mVgsn3iiX3Ho01OvM4g==HiRKufp+di3P7fKy5Ff/YQ==isZj8bEPhh7wxSeeRVPlQQ==bb+ggsFlww30mraEM1zStA==uTvY2JT6gFAfx450QnJJbA==GOAaE+De2H6qsDfL8MH6dA==GOyz8YbufR+PmvjDEmaYWw==0VNwlYx9ZMMDNHeCVMmy/Q==6HbvKXy+CFik5NGM21btUw==XEByWN5d5sYIMRGJmR3BSg==t+ikE9JCjIWIULgEVctIGg==WHsXfcgHXaqMXC509vyXGg==RMusrOeInpJVEaOCTjSDpQ==SGAze9Mpe6rG46xaOFRttQ==GpleEYoTk9KxT0BPnGT99w==lNBXW1EC5uR0+h2rUWsiAQ==dH299HmQm6lMySyGaPa4RA==t+mWWUOYRbqmJoupaZc9xg==dH9PcpT+SZgFY3IE7QQfmg==sijLvfrBxRTPzgSfgnT6uw==bt4UmPtDi/4OZghKtiwevQ==sijLvfrBxRTPzgSfgnT6uw==wQ/CcBWCKlgxRC0qDKQ2HA==wQ/CcBWCKlgxRC0qDKQ2HA==wQ/CcBWCKlgxRC0qDKQ2HA==wQ/CcBWCKlgxRC0qDKQ2HA==wQ/CcBWCKlgxRC0qDKQ2HA==wQ/CcBWCKlgxRC0qDKQ2HA==iIrDIJE+H6Ly9SUTlBu1Ww==wQ/CcBWCKlgxRC0qDKQ2HA==wQ/CcBWCKlgxRC0qDKQ2HA==iIrDIJE+H6Ly9SUTlBu1Ww==0/bEUXXlQlO+apnvVrzyzw==iIrDIJE+H6Ly9SUTlBu1Ww==iIrDIJE+H6Ly9SUTlBu1Ww==iIrDIJE+H6Ly9SUTlBu1Ww==0/bEUXXlQlO+apnvVrzyzw==IJSnxhOGLGbqsYoe0B6bcg==0/bEUXXlQlO+apnvVrzyzw==0/bEUXXlQlO+apnvVrzyzw==0/bEUXXlQlO+apnvVrzyzw==0/bEUXXlQlO+apnvVrzyzw==IJSnxhOGLGbqsYoe0B6bcg==4tqeJxNtcbOwIfFzJRfp1w==IJSnxhOGLGbqsYoe0B6bcg==IJSnxhOGLGbqsYoe0B6bcg==IJSnxhOGLGbqsYoe0B6bcg==IJSnxhOGLGbqsYoe0B6bcg==IJSnxhOGLGbqsYoe0B6bcg==4tqeJxNtcbOwIfFzJRfp1w==1gG1Zt1H8nu3WL/fUapYEQ==4tqeJxNtcbOwIfFzJRfp1w==4tqeJxNtcbOwIfFzJRfp1w==4tqeJxNtcbOwIfFzJRfp1w==4tqeJxNtcbOwIfFzJRfp1w==4tqeJxNtcbOwIfFzJRfp1w==4tqeJxNtcbOwIfFzJRfp1w==1gG1Zt1H8nu3WL/fUapYEQ==1gG1Zt1H8nu3WL/fUapYEQ==1gG1Zt1H8nu3WL/fUapYEQ==1gG1Zt1H8nu3WL/fUapYEQ==1gG1Zt1H8nu3WL/fUapYEQ==1gG1Zt1H8nu3WL/fUapYEQ==1gG1Zt1H8nu3WL/fUapYEQ==1gG1Zt1H8nu3WL/fUapYEQ==kpaJ6Ns/cYrn4CG3dKwsgg==kpaJ6Ns/cYrn4CG3dKwsgg==kpaJ6Ns/cYrn4CG3dKwsgg==kpaJ6Ns/cYrn4CG3dKwsgg==kpaJ6Ns/cYrn4CG3dKwsgg==kpaJ6Ns/cYrn4CG3dKwsgg==CKlpu3NGtHM2DzeAbdHlvw==CKlpu3NGtHM2DzeAbdHlvw==CKlpu3NGtHM2DzeAbdHlvw==CKlpu3NGtHM2DzeAbdHlvw==CKlpu3NGtHM2DzeAbdHlvw==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==t+mWWUOYRbqmJoupaZc9xg==dH9PcpT+SZgFY3IE7QQfmg==sijLvfrBxRTPzgSfgnT6uw==bt4UmPtDi/4OZghKtiwevQ==Ry+VsoMaFs03yboS0xuqzQ==wQ/CcBWCKlgxRC0qDKQ2HA==wQ/CcBWCKlgxRC0qDKQ2HA==wQ/CcBWCKlgxRC0qDKQ2HA==iIrDIJE+H6Ly9SUTlBu1Ww==iIrDIJE+H6Ly9SUTlBu1Ww==iIrDIJE+H6Ly9SUTlBu1Ww==QyTmlq8MUjmMkg9aE53VjA==iIrDIJE+H6Ly9SUTlBu1Ww==iIrDIJE+H6Ly9SUTlBu1Ww==QyTmlq8MUjmMkg9aE53VjA==hxjRHUwf9lDYg8Vt1Hu0dg==Bq+Z2Btm0IQoqxge3xnptg==4tqeJxNtcbOwIfFzJRfp1w==Bq+Z2Btm0IQoqxge3xnptg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==hxjRHUwf9lDYg8Vt1Hu0dg==t+mWWUOYRbqmJoupaZc9xg==3CpeQv14/K407pXUQbmrsA==sijLvfrBxRTPzgSfgnT6uw==0/bEUXXlQlO+apnvVrzyzw==sijLvfrBxRTPzgSfgnT6uw==wQ/CcBWCKlgxRC0qDKQ2HA==t+mWWUOYRbqmJoupaZc9xg==qONvLQH7NdDFBg538CtL7w==sijLvfrBxRTPzgSfgnT6uw==cK8wUfFaWJ1pGgmZXCwoPg==iIrDIJE+H6Ly9SUTlBu1Ww==Ry+VsoMaFs03yboS0xuqzQ==sijLvfrBxRTPzgSfgnT6uw==wQ/CcBWCKlgxRC0qDKQ2HA==5hkTq//ay5mMUgXkpep4RA==iIrDIJE+H6Ly9SUTlBu1Ww==5hkTq//ay5mMUgXkpep4RA==sijLvfrBxRTPzgSfgnT6uw==at9XDzScVOL2hMp8C9Ks9g==sijLvfrBxRTPzgSfgnT6uw==S+Jb0d1WS6bFmWDpCzAckw==RcSOGj5sH01TqDPujbHT1g==kpaJ6Ns/cYrn4CG3dKwsgg==5JbQkECK6/hqhhdwMXeNdg==XCJgK1WlpE7CdadoKBw6IA==2YwkQugt9mt1C9jzGhX+Ag==Odr2raytV+rScXs5Afgptg==A6K22cyu9PzdGnGyUL9yaA==dma88Zbp71Ay2nTVhIR47Q==fe/pvrCaau2wbPMDZsebSQ==cK8wUfFaWJ1pGgmZXCwoPg==tKRnwVATUPzR1TBPI+CaOg==mwVhWX5rU8Bswm8266zsmQ==9H1hx/g8tkV7X6BlcRvx3g==uTvY2JT6gFAfx450QnJJbA==AlgeFa+dqC0DOqH0T5JlTQ==WAUDPM5WnOYiG818ggK7AA==IJSnxhOGLGbqsYoe0B6bcg==0/13nJPHOZOBWjvbo2oYPA==dH299HmQm6lMySyGaPa4RA==t+mWWUOYRbqmJoupaZc9xg==sijLvfrBxRTPzgSfgnT6uw==KFZnrMSAFpHElZdpYFhVpA==0yvsfvdCu1kMjJAc86GqAw==A3SUJ/5XaNbwaDRFf3e5Cg==8VNxzfgsjKuP9L2pncKeaA==TJk4Oh6tgphBqfvntlcM/A==zOa/RuRcEYv9wF0320TNlQ==SQ8ccSdbpJ8HLJy3KvATwA==rXNHLRdQJUY4H1xqXNEOgQ==t+mWWUOYRbqmJoupaZc9xg==sijLvfrBxRTPzgSfgnT6uw==yNVSh9cMYQTVYVT+0RQosw==N8C7EG42KtWdHqQANUaPFg==cK8wUfFaWJ1pGgmZXCwoPg==vXFz03P9eCJLk4yy7Bz+yQ==XCJgK1WlpE7CdadoKBw6IA==vGZYL2hukrh3pGh0lkWGDw==XCJgK1WlpE7CdadoKBw6IA==t+ikE9JCjIWIULgEVctIGg==etJKJxsbsMHb4tNLmz/IBQ==7sWeGjwasubJqsxa6lR9Dw==VZso9i80zO0pctT46qyL4g==VZso9i80zO0pctT46qyL4g==ZNQLm4fATg9yO0Zqakbhdg==N8C7EG42KtWdHqQANUaPFg==xAaG0l9BC6mNhOoV13e3zA==t+mWWUOYRbqmJoupaZc9xg==+q1Cxptq3FPmeXFbmAwh1w==S+Jb0d1WS6bFmWDpCzAckw==mP52gA+O4mkclBmDvySBgQ==lsNZXS1D4Q3mXgy5KSubAQ==/YTs3y0zQ4+lXtEW7nuc0g==0VNwlYx9ZMMDNHeCVMmy/Q==5JbQkECK6/hqhhdwMXeNdg==hxjRHUwf9lDYg8Vt1Hu0dg==0VNwlYx9ZMMDNHeCVMmy/Q==dma88Zbp71Ay2nTVhIR47Q==CayfwWWKjZdbzrQMoQ6A9w==EkI2xfd6TzRpgRC250OpAg==lwyzBUsm52mOPKfwoZiqjg==dma88Zbp71Ay2nTVhIR47Q==/WgnMYvNFKugLCqbOA1wEw==lNBXW1EC5uR0+h2rUWsiAQ==QlgzyxxCRmlKLnyPThnSaQ==M9HLJirreghnkb7i7ZF18A==kBlE8AG+/b5yXS+DKwyKqg==p2brP6G3XSuk/aBrQTSseA==emidHT8Iiw1kS0usJIp7HA==at9XDzScVOL2hMp8C9Ks9g==hszuq5n4poyABHe8FzLP1g==8oBKiAksGLk9fDePIs7X5w==PKrPaVAIqbRCqNlxRrttWw==CKlpu3NGtHM2DzeAbdHlvw==Y81hMWh87cmGu4Ptrnv67Q==9H1hx/g8tkV7X6BlcRvx3g==dma88Zbp71Ay2nTVhIR47Q==5/K8vfXJKSp9xCkKbhbo6g==i0w9qGy/ULuMZEz5vajqqA==lsNZXS1D4Q3mXgy5KSubAQ==dH9PcpT+SZgFY3IE7QQfmg==L12zt1crCUjcuFb+D+K6RA==U6eWKjyIeoUjg1gbs4t2tQ==dKF9nXyIHsv7XfInH9fgrw==PNCSpQERyO9ieSssl66zQA==88P4JrjpedZgfFpUG4glqg==qS9d46RS2KWljjTSG/ElRQ==jRHWFhbymCSg28jYVYGodQ==hmneyLjQNmUQdrNFFXH9AA==U6eWKjyIeoUjg1gbs4t2tQ==Sc0qvaI2eCES/VgYr7ueVA==GOAaE+De2H6qsDfL8MH6dA==ZARBM+FCLim6CnjKUqXiMA==o4IsfWyJ7DbpX9RzKK010w==o4IsfWyJ7DbpX9RzKK010w==FMB3YYAogWTvhorVydp8tw==t+mWWUOYRbqmJoupaZc9xg==tuj36VB+2HBvMESlvVfDjw=="));
    }
}
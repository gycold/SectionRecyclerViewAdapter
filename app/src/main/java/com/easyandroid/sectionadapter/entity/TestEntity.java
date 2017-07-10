package com.easyandroid.sectionadapter.entity;

import java.util.List;

/**
 * package: com.easyandroid.sectionadapter.entity.TestEntity
 * author: gyc
 * description:
 * time: create at 2017/7/8 3:16
 */

public class TestEntity {

    private BodyBean body;

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public static class BodyBean {
        private List<EListBean> eList;

        public List<EListBean> getEList() {
            return eList;
        }

        public void setEList(List<EListBean> eList) {
            this.eList = eList;
        }

        public static class EListBean {

            private String picture;
            private String time;
            private String userName;
            private String content;
            private String browser;
            private List<String> ePicture;

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getBrowser() {
                return browser;
            }

            public void setBrowser(String browser) {
                this.browser = browser;
            }

            public List<String> getEPicture() {
                return ePicture;
            }

            public void setEPicture(List<String> ePicture) {
                this.ePicture = ePicture;
            }
        }
    }
}

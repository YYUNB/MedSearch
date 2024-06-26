package com.example.mobileproject;

import java.io.Serializable;

public class Medicine implements Serializable {
    private String itemSeq;
    private String itemName;    // 가스디알
    private String chart;       // 녹색의 원형 필름코팅정
    private String drugShape;   // 원형
    private String colorClass;  // 연두
    private String className;   // 기타의 소화기관용약
    private String etcOtcName;  // 전문의약품
    private String formCodeName;    // 당의정, 필름코팅정

    public Medicine() {}

    public String getItemSeq() { return itemSeq; }
    public void setItemSeq(String itemSeq) { this.itemSeq = itemSeq; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public String getChart() { return chart; }
    public void setChart(String chart) { this.chart = chart; }

    public String getDrugShape() { return drugShape; }
    public void setDrugShape(String drugShape) { this.drugShape = drugShape; }

    public String getColorClass() { return colorClass; }
    public void setColorClass(String colorClass) { this.colorClass = colorClass; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public String getEtcOtcName() { return etcOtcName; }
    public void setEtcOtcName(String etcOtcName) { this.etcOtcName = etcOtcName; }

    public String getFormCodeName() { return formCodeName; }
    public void setFormCodeName(String formCodeName) { this.formCodeName = formCodeName; }

}

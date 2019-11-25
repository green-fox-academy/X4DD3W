package com.groot.demo.models;

public class Cargo {

  private Double caliber25 = 0.0;
  private Double caliber30 = 0.0;
  private Double caliber50 = 0.0;
  private String shipstatus = "empty";
  private Boolean ready = false;

  public Cargo() {

  }

  public void cargoFiller(Double caliber, Integer amount) {
    switch (caliber.toString()) {
      case ".25":
        this.caliber25 = caliber * amount;
        break;
      case ".30":
        this.caliber30 = caliber * amount;
        break;
      case ".50":
        this.caliber50 = caliber * amount;
        break;
    }
    Integer max = 12500;
    Integer shipPercent = (amount / max) * 100;
    String amountStatus;
    if (shipPercent == 0) {
      amountStatus = "empty";
    } else if (shipPercent == 100) {
      amountStatus = "full";
    } else if(shipPercent > 100) {
      amountStatus = "overloaded";
    } else {
      amountStatus = shipPercent + "%";
    }
    this.shipstatus = amountStatus;
    this.ready = shipstatus.equals("100%");
  }

  public Double getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(Double caliber25) {
    this.caliber25 = caliber25;
  }

  public Double getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(Double caliber30) {
    this.caliber30 = caliber30;
  }

  public Double getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(Double caliber50) {
    this.caliber50 = caliber50;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }
}

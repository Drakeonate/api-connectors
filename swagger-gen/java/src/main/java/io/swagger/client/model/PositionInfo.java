/*
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * PositionInfo.
 */
@ApiModel(description = "PositionInfo.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-15T15:11:34.350+08:00")
public class PositionInfo {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("user_id")
  private BigDecimal userId = null;

  @SerializedName("risk_id")
  private BigDecimal riskId = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("position_value")
  private BigDecimal positionValue = null;

  @SerializedName("entry_price")
  private BigDecimal entryPrice = null;

  @SerializedName("leverage")
  private BigDecimal leverage = null;

  @SerializedName("auto_add_margin")
  private BigDecimal autoAddMargin = null;

  @SerializedName("position_margin")
  private BigDecimal positionMargin = null;

  @SerializedName("liq_price")
  private BigDecimal liqPrice = null;

  @SerializedName("bust_price")
  private BigDecimal bustPrice = null;

  @SerializedName("occ_closing_fee")
  private BigDecimal occClosingFee = null;

  @SerializedName("occ_funding_fee")
  private BigDecimal occFundingFee = null;

  @SerializedName("take_profit")
  private BigDecimal takeProfit = null;

  @SerializedName("stop_loss")
  private BigDecimal stopLoss = null;

  @SerializedName("trailing_stop")
  private BigDecimal trailingStop = null;

  @SerializedName("position_status")
  private String positionStatus = null;

  @SerializedName("deleverage_indicator")
  private String deleverageIndicator = null;

  @SerializedName("oc_calc_data")
  private String ocCalcData = null;

  @SerializedName("order_margin")
  private BigDecimal orderMargin = null;

  @SerializedName("wallet_balance")
  private BigDecimal walletBalance = null;

  @SerializedName("unrealised_pnl")
  private BigDecimal unrealisedPnl = null;

  @SerializedName("realised_pnl")
  private BigDecimal realisedPnl = null;

  @SerializedName("cum_realised_pnl")
  private BigDecimal cumRealisedPnl = null;

  @SerializedName("cum_commission")
  private BigDecimal cumCommission = null;

  @SerializedName("cross_seq")
  private BigDecimal crossSeq = null;

  @SerializedName("position_seq")
  private BigDecimal positionSeq = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  public PositionInfo id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public PositionInfo userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public PositionInfo riskId(BigDecimal riskId) {
    this.riskId = riskId;
    return this;
  }

   /**
   * Get riskId
   * @return riskId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRiskId() {
    return riskId;
  }

  public void setRiskId(BigDecimal riskId) {
    this.riskId = riskId;
  }

  public PositionInfo symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public PositionInfo side(String side) {
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public PositionInfo size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public PositionInfo positionValue(BigDecimal positionValue) {
    this.positionValue = positionValue;
    return this;
  }

   /**
   * Get positionValue
   * @return positionValue
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPositionValue() {
    return positionValue;
  }

  public void setPositionValue(BigDecimal positionValue) {
    this.positionValue = positionValue;
  }

  public PositionInfo entryPrice(BigDecimal entryPrice) {
    this.entryPrice = entryPrice;
    return this;
  }

   /**
   * Get entryPrice
   * @return entryPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEntryPrice() {
    return entryPrice;
  }

  public void setEntryPrice(BigDecimal entryPrice) {
    this.entryPrice = entryPrice;
  }

  public PositionInfo leverage(BigDecimal leverage) {
    this.leverage = leverage;
    return this;
  }

   /**
   * Get leverage
   * @return leverage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLeverage() {
    return leverage;
  }

  public void setLeverage(BigDecimal leverage) {
    this.leverage = leverage;
  }

  public PositionInfo autoAddMargin(BigDecimal autoAddMargin) {
    this.autoAddMargin = autoAddMargin;
    return this;
  }

   /**
   * Get autoAddMargin
   * @return autoAddMargin
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAutoAddMargin() {
    return autoAddMargin;
  }

  public void setAutoAddMargin(BigDecimal autoAddMargin) {
    this.autoAddMargin = autoAddMargin;
  }

  public PositionInfo positionMargin(BigDecimal positionMargin) {
    this.positionMargin = positionMargin;
    return this;
  }

   /**
   * Get positionMargin
   * @return positionMargin
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPositionMargin() {
    return positionMargin;
  }

  public void setPositionMargin(BigDecimal positionMargin) {
    this.positionMargin = positionMargin;
  }

  public PositionInfo liqPrice(BigDecimal liqPrice) {
    this.liqPrice = liqPrice;
    return this;
  }

   /**
   * Get liqPrice
   * @return liqPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLiqPrice() {
    return liqPrice;
  }

  public void setLiqPrice(BigDecimal liqPrice) {
    this.liqPrice = liqPrice;
  }

  public PositionInfo bustPrice(BigDecimal bustPrice) {
    this.bustPrice = bustPrice;
    return this;
  }

   /**
   * Get bustPrice
   * @return bustPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBustPrice() {
    return bustPrice;
  }

  public void setBustPrice(BigDecimal bustPrice) {
    this.bustPrice = bustPrice;
  }

  public PositionInfo occClosingFee(BigDecimal occClosingFee) {
    this.occClosingFee = occClosingFee;
    return this;
  }

   /**
   * Get occClosingFee
   * @return occClosingFee
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOccClosingFee() {
    return occClosingFee;
  }

  public void setOccClosingFee(BigDecimal occClosingFee) {
    this.occClosingFee = occClosingFee;
  }

  public PositionInfo occFundingFee(BigDecimal occFundingFee) {
    this.occFundingFee = occFundingFee;
    return this;
  }

   /**
   * Get occFundingFee
   * @return occFundingFee
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOccFundingFee() {
    return occFundingFee;
  }

  public void setOccFundingFee(BigDecimal occFundingFee) {
    this.occFundingFee = occFundingFee;
  }

  public PositionInfo takeProfit(BigDecimal takeProfit) {
    this.takeProfit = takeProfit;
    return this;
  }

   /**
   * Get takeProfit
   * @return takeProfit
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTakeProfit() {
    return takeProfit;
  }

  public void setTakeProfit(BigDecimal takeProfit) {
    this.takeProfit = takeProfit;
  }

  public PositionInfo stopLoss(BigDecimal stopLoss) {
    this.stopLoss = stopLoss;
    return this;
  }

   /**
   * Get stopLoss
   * @return stopLoss
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getStopLoss() {
    return stopLoss;
  }

  public void setStopLoss(BigDecimal stopLoss) {
    this.stopLoss = stopLoss;
  }

  public PositionInfo trailingStop(BigDecimal trailingStop) {
    this.trailingStop = trailingStop;
    return this;
  }

   /**
   * Get trailingStop
   * @return trailingStop
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTrailingStop() {
    return trailingStop;
  }

  public void setTrailingStop(BigDecimal trailingStop) {
    this.trailingStop = trailingStop;
  }

  public PositionInfo positionStatus(String positionStatus) {
    this.positionStatus = positionStatus;
    return this;
  }

   /**
   * Get positionStatus
   * @return positionStatus
  **/
  @ApiModelProperty(value = "")
  public String getPositionStatus() {
    return positionStatus;
  }

  public void setPositionStatus(String positionStatus) {
    this.positionStatus = positionStatus;
  }

  public PositionInfo deleverageIndicator(String deleverageIndicator) {
    this.deleverageIndicator = deleverageIndicator;
    return this;
  }

   /**
   * Get deleverageIndicator
   * @return deleverageIndicator
  **/
  @ApiModelProperty(value = "")
  public String getDeleverageIndicator() {
    return deleverageIndicator;
  }

  public void setDeleverageIndicator(String deleverageIndicator) {
    this.deleverageIndicator = deleverageIndicator;
  }

  public PositionInfo ocCalcData(String ocCalcData) {
    this.ocCalcData = ocCalcData;
    return this;
  }

   /**
   * Get ocCalcData
   * @return ocCalcData
  **/
  @ApiModelProperty(value = "")
  public String getOcCalcData() {
    return ocCalcData;
  }

  public void setOcCalcData(String ocCalcData) {
    this.ocCalcData = ocCalcData;
  }

  public PositionInfo orderMargin(BigDecimal orderMargin) {
    this.orderMargin = orderMargin;
    return this;
  }

   /**
   * Get orderMargin
   * @return orderMargin
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderMargin() {
    return orderMargin;
  }

  public void setOrderMargin(BigDecimal orderMargin) {
    this.orderMargin = orderMargin;
  }

  public PositionInfo walletBalance(BigDecimal walletBalance) {
    this.walletBalance = walletBalance;
    return this;
  }

   /**
   * Get walletBalance
   * @return walletBalance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getWalletBalance() {
    return walletBalance;
  }

  public void setWalletBalance(BigDecimal walletBalance) {
    this.walletBalance = walletBalance;
  }

  public PositionInfo unrealisedPnl(BigDecimal unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
    return this;
  }

   /**
   * Get unrealisedPnl
   * @return unrealisedPnl
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnrealisedPnl() {
    return unrealisedPnl;
  }

  public void setUnrealisedPnl(BigDecimal unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
  }

  public PositionInfo realisedPnl(BigDecimal realisedPnl) {
    this.realisedPnl = realisedPnl;
    return this;
  }

   /**
   * Get realisedPnl
   * @return realisedPnl
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRealisedPnl() {
    return realisedPnl;
  }

  public void setRealisedPnl(BigDecimal realisedPnl) {
    this.realisedPnl = realisedPnl;
  }

  public PositionInfo cumRealisedPnl(BigDecimal cumRealisedPnl) {
    this.cumRealisedPnl = cumRealisedPnl;
    return this;
  }

   /**
   * Get cumRealisedPnl
   * @return cumRealisedPnl
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCumRealisedPnl() {
    return cumRealisedPnl;
  }

  public void setCumRealisedPnl(BigDecimal cumRealisedPnl) {
    this.cumRealisedPnl = cumRealisedPnl;
  }

  public PositionInfo cumCommission(BigDecimal cumCommission) {
    this.cumCommission = cumCommission;
    return this;
  }

   /**
   * Get cumCommission
   * @return cumCommission
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCumCommission() {
    return cumCommission;
  }

  public void setCumCommission(BigDecimal cumCommission) {
    this.cumCommission = cumCommission;
  }

  public PositionInfo crossSeq(BigDecimal crossSeq) {
    this.crossSeq = crossSeq;
    return this;
  }

   /**
   * Get crossSeq
   * @return crossSeq
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCrossSeq() {
    return crossSeq;
  }

  public void setCrossSeq(BigDecimal crossSeq) {
    this.crossSeq = crossSeq;
  }

  public PositionInfo positionSeq(BigDecimal positionSeq) {
    this.positionSeq = positionSeq;
    return this;
  }

   /**
   * Get positionSeq
   * @return positionSeq
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPositionSeq() {
    return positionSeq;
  }

  public void setPositionSeq(BigDecimal positionSeq) {
    this.positionSeq = positionSeq;
  }

  public PositionInfo createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public PositionInfo updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionInfo positionInfo = (PositionInfo) o;
    return Objects.equals(this.id, positionInfo.id) &&
        Objects.equals(this.userId, positionInfo.userId) &&
        Objects.equals(this.riskId, positionInfo.riskId) &&
        Objects.equals(this.symbol, positionInfo.symbol) &&
        Objects.equals(this.side, positionInfo.side) &&
        Objects.equals(this.size, positionInfo.size) &&
        Objects.equals(this.positionValue, positionInfo.positionValue) &&
        Objects.equals(this.entryPrice, positionInfo.entryPrice) &&
        Objects.equals(this.leverage, positionInfo.leverage) &&
        Objects.equals(this.autoAddMargin, positionInfo.autoAddMargin) &&
        Objects.equals(this.positionMargin, positionInfo.positionMargin) &&
        Objects.equals(this.liqPrice, positionInfo.liqPrice) &&
        Objects.equals(this.bustPrice, positionInfo.bustPrice) &&
        Objects.equals(this.occClosingFee, positionInfo.occClosingFee) &&
        Objects.equals(this.occFundingFee, positionInfo.occFundingFee) &&
        Objects.equals(this.takeProfit, positionInfo.takeProfit) &&
        Objects.equals(this.stopLoss, positionInfo.stopLoss) &&
        Objects.equals(this.trailingStop, positionInfo.trailingStop) &&
        Objects.equals(this.positionStatus, positionInfo.positionStatus) &&
        Objects.equals(this.deleverageIndicator, positionInfo.deleverageIndicator) &&
        Objects.equals(this.ocCalcData, positionInfo.ocCalcData) &&
        Objects.equals(this.orderMargin, positionInfo.orderMargin) &&
        Objects.equals(this.walletBalance, positionInfo.walletBalance) &&
        Objects.equals(this.unrealisedPnl, positionInfo.unrealisedPnl) &&
        Objects.equals(this.realisedPnl, positionInfo.realisedPnl) &&
        Objects.equals(this.cumRealisedPnl, positionInfo.cumRealisedPnl) &&
        Objects.equals(this.cumCommission, positionInfo.cumCommission) &&
        Objects.equals(this.crossSeq, positionInfo.crossSeq) &&
        Objects.equals(this.positionSeq, positionInfo.positionSeq) &&
        Objects.equals(this.createdAt, positionInfo.createdAt) &&
        Objects.equals(this.updatedAt, positionInfo.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, riskId, symbol, side, size, positionValue, entryPrice, leverage, autoAddMargin, positionMargin, liqPrice, bustPrice, occClosingFee, occFundingFee, takeProfit, stopLoss, trailingStop, positionStatus, deleverageIndicator, ocCalcData, orderMargin, walletBalance, unrealisedPnl, realisedPnl, cumRealisedPnl, cumCommission, crossSeq, positionSeq, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    riskId: ").append(toIndentedString(riskId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    positionValue: ").append(toIndentedString(positionValue)).append("\n");
    sb.append("    entryPrice: ").append(toIndentedString(entryPrice)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    autoAddMargin: ").append(toIndentedString(autoAddMargin)).append("\n");
    sb.append("    positionMargin: ").append(toIndentedString(positionMargin)).append("\n");
    sb.append("    liqPrice: ").append(toIndentedString(liqPrice)).append("\n");
    sb.append("    bustPrice: ").append(toIndentedString(bustPrice)).append("\n");
    sb.append("    occClosingFee: ").append(toIndentedString(occClosingFee)).append("\n");
    sb.append("    occFundingFee: ").append(toIndentedString(occFundingFee)).append("\n");
    sb.append("    takeProfit: ").append(toIndentedString(takeProfit)).append("\n");
    sb.append("    stopLoss: ").append(toIndentedString(stopLoss)).append("\n");
    sb.append("    trailingStop: ").append(toIndentedString(trailingStop)).append("\n");
    sb.append("    positionStatus: ").append(toIndentedString(positionStatus)).append("\n");
    sb.append("    deleverageIndicator: ").append(toIndentedString(deleverageIndicator)).append("\n");
    sb.append("    ocCalcData: ").append(toIndentedString(ocCalcData)).append("\n");
    sb.append("    orderMargin: ").append(toIndentedString(orderMargin)).append("\n");
    sb.append("    walletBalance: ").append(toIndentedString(walletBalance)).append("\n");
    sb.append("    unrealisedPnl: ").append(toIndentedString(unrealisedPnl)).append("\n");
    sb.append("    realisedPnl: ").append(toIndentedString(realisedPnl)).append("\n");
    sb.append("    cumRealisedPnl: ").append(toIndentedString(cumRealisedPnl)).append("\n");
    sb.append("    cumCommission: ").append(toIndentedString(cumCommission)).append("\n");
    sb.append("    crossSeq: ").append(toIndentedString(crossSeq)).append("\n");
    sb.append("    positionSeq: ").append(toIndentedString(positionSeq)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


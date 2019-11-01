package com.gameball.gameball.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Game
{
    @SerializedName("gameName")
    @Expose
    private String gameName;
    @SerializedName("challengeId")
    @Expose
    private Integer challengeId;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("isUnlocked")
    @Expose
    private Boolean isUnlocked;
    @SerializedName("activationCriteriaTypeId")
    @Expose
    private Integer activationCriteriaTypeId;
    @SerializedName("activationFrubes")
    @Expose
    private Integer activationFrubes;
    @SerializedName("activationLevel")
    @Expose
    private Integer activationLevel;
    @SerializedName("rewardFrubies")
    @Expose
    private Integer rewardFrubies;
    @SerializedName("rewardPoints")
    @Expose
    private Integer rewardPoints;
    @SerializedName("highScore")
    @Expose
    private Integer highScore;
    @SerializedName("highScoreAmount")
    @Expose
    private Integer highScoreAmount;
    @SerializedName("amountUnit")
    @Expose
    private String amountUnit;
    @SerializedName("levelName")
    @Expose
    private String levelName;
    @SerializedName("behaviorTypeId")
    @Expose
    private Integer behaviorTypeId;
    @SerializedName("behaviorType")
    @Expose
    private String behaviorType;
    @SerializedName("targetActionsCount")
    @Expose
    private Integer targetActionsCount;
    @SerializedName("targetAmount")
    @Expose
    private Integer targetAmount;
    @SerializedName("actionsCompletedPercentage")
    @Expose
    private Double actionsCompletedPercentage;
    @SerializedName("amountCompletedPercentage")
    @Expose
    private Double amountCompletedPercentage;
    @SerializedName("actionsAndAmountCompletedPercentage")
    @Expose
    private Double actionsAndAmountCompletedPercentage;
    @SerializedName("completionPercentage")
    @Expose
    private Double completionPercentage;
    @SerializedName("isRepeatable")
    @Expose
    private Boolean isRepeatable;
    @SerializedName("isReferral")
    @Expose
    private Boolean isReferral;
    @SerializedName("achievedCount")
    @Expose
    private Integer achievedCount;
    @SerializedName("achievedActionsCount")
    @Expose
    private Integer achievedActionsCount;
    @SerializedName("currentAmount")
    @Expose
    private Integer currentAmount;
    @SerializedName("userMessage")
    @Expose
    private String userMessage;
    @SerializedName("milestones")
    @Expose
    private ArrayList<Milestone> milestones;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Integer getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(Integer challengeId) {
        this.challengeId = challengeId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isUnlocked() {
        return isUnlocked;
    }

    public void setIsUnlocked(Boolean isUnlocked) {
        this.isUnlocked = isUnlocked;
    }

    public Integer getActivationCriteriaTypeId() {
        return activationCriteriaTypeId;
    }

    public void setActivationCriteriaTypeId(Integer activationCriteriaTypeId) {
        this.activationCriteriaTypeId = activationCriteriaTypeId;
    }

    public Integer getActivationFrubies() {
        return activationFrubes;
    }

    public void setActivationFrubes(Integer activationFrubes) {
        this.activationFrubes = activationFrubes;
    }

    public Integer getActivationLevel() {
        return activationLevel;
    }

    public void setActivationLevel(Integer activationLevel) {
        this.activationLevel = activationLevel;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Integer getBehaviorTypeId() {
        return behaviorTypeId;
    }

    public void setBehaviorTypeId(Integer behaviorTypeId) {
        this.behaviorTypeId = behaviorTypeId;
    }

    public Integer getTargetActionsCount() {
        return targetActionsCount;
    }

    public void setTargetActionsCount(Integer targetActionsCount) {
        this.targetActionsCount = targetActionsCount;
    }

    public Integer getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Integer targetAmount) {
        this.targetAmount = targetAmount;
    }

    public Double getActionsCompletedPercentage() {
        return actionsCompletedPercentage;
    }

    public void setActionsCompletedPercentage(Double actionsCompletedPercentage) {
        this.actionsCompletedPercentage = actionsCompletedPercentage;
    }

    public Double getAmountCompletedPercentage() {
        return amountCompletedPercentage;
    }

    public void setAmountCompletedPercentage(Double amountCompletedPercentage) {
        this.amountCompletedPercentage = amountCompletedPercentage;
    }

    public Double getActionsAndAmountCompletedPercentage() {
        return actionsAndAmountCompletedPercentage;
    }

    public void setActionsAndAmountCompletedPercentage(Double actionsAndAmountCompletedPercentage) {
        this.actionsAndAmountCompletedPercentage = actionsAndAmountCompletedPercentage;
    }

    public Boolean isRepeatable() {
        return isRepeatable;
    }

    public void setIsRepeatable(Boolean isRepeatable) {
        this.isRepeatable = isRepeatable;
    }

    public Integer getAchievedCount() {
        return achievedCount;
    }

    public void setAchievedCount(Integer achievedCount) {
        this.achievedCount = achievedCount;
    }

    public Integer getAchievedActionsCount() {
        return achievedActionsCount;
    }

    public void setAchievedActionsCount(Integer achievedActionsCount) {
        this.achievedActionsCount = achievedActionsCount;
    }

    public Integer getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(Integer currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public ArrayList<Milestone> getMilestones()
    {
        return milestones;
    }

    public Integer getRewardFrubies()
    {
        return rewardFrubies;
    }

    public Integer getRewardPoints()
    {
        return rewardPoints;
    }

    public Integer getHighScore()
    {
        return highScore;
    }

    public Integer getHighScoreAmount()
    {
        return highScoreAmount;
    }

    public String getAmountUnit()
    {
        return amountUnit;
    }

    public Integer getActivationFrubes()
    {
        return activationFrubes;
    }

    public String getBehaviorType()
    {
        return behaviorType;
    }

    public Double getCompletionPercentage()
    {
        return completionPercentage;
    }

    public Boolean isReferral()
    {
        return isReferral;
    }

    public boolean isAchieved()
    {
        return achievedCount > 0;
    }
}

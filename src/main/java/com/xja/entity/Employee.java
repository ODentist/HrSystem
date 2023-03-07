package com.xja.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @TableName employee
 */
public class Employee implements Serializable {
    /**
     * 员工编号
     */
    private Integer id;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */
    //private Date birthday;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 婚姻状况
     */
    //private Object wedlock;

    /**
     * 民族
     */
    private Integer nationid;

   public Employee(Integer id, String name, String gender, String idCard, Integer nationid) {
      this.id = id;
      this.name = name;
      this.gender = gender;
      this.idCard = idCard;
      this.nationid = nationid;
   }

   public Employee() {
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public String getIdCard() {
      return idCard;
   }

   public void setIdCard(String idCard) {
      this.idCard = idCard;
   }

   public Integer getNationid() {
      return nationid;
   }

   public void setNationid(Integer nationid) {
      this.nationid = nationid;
   }

   @Override
   public String toString() {
      return "Employee{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", gender='" + gender + '\'' +
              ", idcard='" + idCard + '\'' +
              ", nationid=" + nationid +
              '}';
   }
}
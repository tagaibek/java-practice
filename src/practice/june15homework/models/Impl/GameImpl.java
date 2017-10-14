package practice.june15homework.models.Impl;

import practice.june15homework.models.Game;

/**
 * Created by Human on 17.06.2017.
 */
class GameImpl implements Game {
 private String name;
 private String status;

 public GameImpl (String name, String status){
  this.name = name;
  this.status =status;
 }
 public String getName(){
  return this.name + "123";
 }

 public String getStatus(){
  return this.status;
 }

 public void setStatus(String status){
  this.status = status;
 }
}
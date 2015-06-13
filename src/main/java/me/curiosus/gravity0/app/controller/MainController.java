package me.curiosus.gravity0.app.controller;

import me.curiosus.gravity0.app.view.MainView;

/**
 * Created by erudite on 6/13/15.
 */
public class MainController {

   public void launch() {
      MainView view = new MainView();
      view.init();
   }

   public static void main(String[] args) {
      new MainController().launch();
   }



}

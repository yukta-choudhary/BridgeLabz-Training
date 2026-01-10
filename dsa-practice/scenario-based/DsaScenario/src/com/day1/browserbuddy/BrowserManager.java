package com.day1.browserbuddy;

//BrowserManager
import java.util.Stack;

public class BrowserManager {

 Stack<BrowserTab> closedTabs = new Stack<>();

 // Close tab
 void closeTab(BrowserTab tab) {
     closedTabs.push(tab);
     System.out.println("Tab closed.");
 }

 // Reopen tab
 BrowserTab reopenTab() {
     if (!closedTabs.isEmpty()) {
         System.out.println("Tab reopened.");
         return closedTabs.pop();
     } else {
         System.out.println("No tabs to reopen.");
         return new BrowserTab();
     }
 }
}


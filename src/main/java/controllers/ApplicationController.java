/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import models.Blackjack;
import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.PathParam;


@Singleton
public class ApplicationController {

    public Result index() {

        return Results.html();

    }
    
    public Result helloWorldJson() {
        
        SimplePojo simplePojo = new SimplePojo();
        simplePojo.content = "Hello World! Hello Json!";

        return Results.json().render(simplePojo);

    }
    
    public static class SimplePojo {

        public String content;
        
    }

    public Result Blackjack() {
        return Results.html().template("views/Blackjack/Blackjack.flt.html");
    }

    public Result gameGet(){
        Blackjack g = new Blackjack();
        g.buildDeck();
        g.shuffle();
        //g.dealFour();
        g.playerHit();
        g.playerHit();
        g.dealerHit();
        g.dealerHit();

        return Results.json().render(g);
    }

    public Result dealPost(Context context, Blackjack g) {
        if(context.getRequestPath().contains("deal")){
            //g.dealFour();
        }
        return Results.json().render(g);
    }

    public Result playerHit(Context context, Blackjack g){
        g.playerHit();
        return Results.json().render(g);
    }

    public Result dealerHit(Context context, Blackjack g){
        g.dealerHit();
        return Results.json().render(g);
    }

    public Result newRound(Context context, Blackjack g){
        g.clearBoard();
        g.buildDeck();
        g.shuffle();
        g.playerHit();
        g.playerHit();
        g.dealerHit();
        g.dealerHit();

        return Results.json().render(g);
    }

<<<<<<< HEAD
    public void doubleDown(Context context, Game g){

    }

    public Result removeCard(Context context, @PathParam("column") int colNumber, Game g){
=======
    public Result removeCard(Context context, @PathParam("column") int colNumber, Blackjack g){
>>>>>>> ed17cae557c69eff11ed534fef9ad91464bc9add
        g.remove(colNumber);
        return  Results.json().render(g);
    }

    public Result moveCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, Blackjack g){
        g.move(colFrom,colTo);
        return  Results.json().render(g);
    }
}

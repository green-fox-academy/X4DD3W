package com.x4dd3w.backendapi.services;

import com.x4dd3w.backendapi.models.SithText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements APIService {

  @Override
  public int sum(int until) {
    int result = 0;
    for (int i = 0; i <= until; i++) {
      result += i;
    }
    return result;
  }

  @Override
  public int factor(int until) {
    int result = 1;
    for (int i = 1; i <= until; i++) {
      result *= i;
    }
    return result;
  }

  @Override
  public int sumArray(List<Integer> listToSum) {
    int result = 0;
    for (int i = 0; i < listToSum.size(); i++) {
      result += listToSum.get(i);
    }
    return result;
  }

  @Override
  public int multiplyArray(List<Integer> listToMultiply) {
    int result = 1;
    for (int i = 1; i < listToMultiply.size(); i++) {
      result *= listToMultiply.get(i);
    }
    return result;
  }

  @Override
  public List<Integer> doubleArray(List<Integer> listToDouble) {
    List<Integer> result = new ArrayList<>();
    for (Integer integer : listToDouble) {
      result.add(integer * 2);
    }
    return result;
  }

  //  "text": "This is my example sentence. Just for fun."
  //And responds with a simplified yoda speak simply switching every 2 words:
  //  "sith_text": "Is this example my sentence. Arrgh. Uhmm. For just fun. Err..err.err."

  //it keeps the capital positions and the end of sentences
  //if a sentence doesn't contain even number of words, it leaves the last as is
  //always puts (one or two) random things at the end of sentences

  @Override
  public String translateToSith(SithText textToTranslate) {
    // "Ez lesz a példamondatom. Vagy esetleg emez."
    Random random = new Random();
    List<String> randomThings = new ArrayList<>(
        Arrays.asList(" Err... err.", " Yuhuu.", " Muahaha..."));
    List<String> sentencesOfText = Arrays.asList(textToTranslate.getText().split("\\. "));
    List<String> wordsOfSentences;
    String temp = "";
    String result = "";
    for (int i = 0; i < sentencesOfText.size(); i++) {
      wordsOfSentences = Arrays.asList((sentencesOfText.get(i).split(" ")));
      for (int j = 0; j < wordsOfSentences.size() - 1; j += 2) {
        temp = wordsOfSentences.get(j);
        wordsOfSentences.set(j, wordsOfSentences.get(j + 1));
        wordsOfSentences.set(j + 1, temp);
      }
      for (int k = 0; k < wordsOfSentences.size(); k++) {
        if (k == wordsOfSentences.size() - 1) {
          result += wordsOfSentences.get(k);
        } else {
          result += wordsOfSentences.get(k) + " ";
        }
      }
      result += ".";
      for (int j = 0; j < random.nextInt(2) + 1; j++) {
        result += randomThings.get(random.nextInt(randomThings.size()));
      }
    }
    return result;
  }
}
package com.example.calculatearrayspring;

import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

@RestController
@CrossOrigin(origins = "*",  allowedHeaders = "*")
@RequestMapping("/calc/")
public class CalculateController {

    public  void fileSave(BigInteger arr[]){
        try(FileWriter writer = new FileWriter("C:\\Users\\Artem\\Desktop\\semenov\\1.txt", false))
        {
            writer.write("");
            for(int j=0;j< arr.length;j++){
                String str= ""+arr[j];

                writer.append(str);
                writer.append('\n');
            }
        }
        catch(IOException ex){
        }
    }
    public  void fileSaveDec(BigDecimal arr[]){
        try(FileWriter writer = new FileWriter("C:\\Users\\Artem\\Desktop\\semenov\\1.txt", false))
        {
            writer.write("");
            for(int j=0;j< arr.length;j++){
                String str= ""+arr[j];

                writer.append(str);
                writer.append('\n');
            }
        }
        catch(IOException ex){
        }
    }
    public  void fileSaveShort(short arr[]){
        try(FileWriter writer = new FileWriter("C:\\Users\\Artem\\Desktop\\semenov\\1.txt", false))
        {
            writer.write("");
            for(int j=0;j< arr.length;j++){
                String str= ""+arr[j];

                writer.append(str);
                writer.append('\n');
            }
        }
        catch(IOException ex){
        }
    }
    public  void fileSaveDouble(float arr[]){
        try(FileWriter writer = new FileWriter("C:\\Users\\Artem\\Desktop\\semenov\\1.txt", false))
        {
            writer.write("");
            for(int j=0;j< arr.length;j++){
                String str= ""+arr[j];

                writer.append(str);
                writer.append('\n');
            }
        }
        catch(IOException ex){
        }
    }
    public  void fileSaveList(List arr){
        try(FileWriter writer = new FileWriter("C:\\Users\\Artem\\Desktop\\semenov\\1.txt", false))
        {
            writer.write("");
            for(int j=0;j< arr.size();j++){
                writer.append(arr.get(j).toString());
                writer.append('\n');
            }
        }
        catch(IOException ex){
        }
    }
    public  void fileSaveDecList(List arrList){
        try(FileWriter writer = new FileWriter("C:\\Users\\Artem\\Desktop\\semenov\\1.txt", false))
        {
            writer.write("");
            for(int j=0;j< arrList.size();j++){
                writer.append(arrList.get(j).toString());
                writer.append('\n');
            }
        }
        catch(IOException ex){
        }
    }
    public  void fileSaveShortList(List arr){
        try(FileWriter writer = new FileWriter("C:\\Users\\Artem\\Desktop\\semenov\\1.txt", false))
        {
            writer.write("");
            for(int j=0;j< arr.size();j++){
                writer.append(arr.get(j).toString());
                writer.append('\n');
            }
        }
        catch(IOException ex){
        }
    }
    public  void fileSaveDList(List arr){
        try(FileWriter writer = new FileWriter("C:\\Users\\Artem\\Desktop\\semenov\\1.txt", false))
        {
            writer.write("");
            for(int j=0;j< arr.size();j++){
                writer.append(arr.get(j).toString());
                writer.append('\n');
            }
        }
        catch(IOException ex){
        }
    }

    public Response calcgetInt( Number num) throws Exception{
        if(num.getOperation()==0){
            BigInteger res =  BigInteger.valueOf(0);
            BigInteger arr[] =  new BigInteger[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = BigInteger.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
                res=res.add((arr[i]));
            }
            time = System.nanoTime() - time;
            fileSave(arr);
            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if (num.getOperation()==1) {
            BigInteger res =  BigInteger.valueOf(0);
            BigInteger arr[] =  new BigInteger[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = BigInteger.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
                res=res.subtract(arr[i]);
            }
            time = System.nanoTime() - time;
            fileSave(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if (num.getOperation()==2) {
            BigInteger res =  BigInteger.valueOf(1);
            BigInteger arr[] =  new BigInteger[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = BigInteger.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
                res=res.multiply((arr[i]));
            }
            time = System.nanoTime() - time;
            fileSave(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else {
            BigDecimal res =  BigDecimal.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
            BigDecimal arr[] =  new BigDecimal[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = BigDecimal.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
                res=res.divide((arr[i]), 100, RoundingMode.HALF_UP);
            }
            time = System.nanoTime() - time;
            fileSaveDec(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }
    }
    public Response calcgetShortInt( Number num) throws Exception{
        if(num.getOperation()==0){
            short res =  (0);
            short arr[] =  new short[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = (short)Math.round(num.getStart() + Math.random()*(num.getFinish()-1));
                System.out.println(arr[i]);
                res+=(arr[i]);
            }
            time = System.nanoTime() - time;
            fileSaveShort(arr);

            Response resp= new Response();
            resp.setResult(Integer.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if (num.getOperation()==1) {
            short res =  (0);
            short arr[] =  new short[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = (short)Math.round(num.getStart() + Math.random()*(num.getFinish()-1));
                res-=(arr[i]);
            }
            time = System.nanoTime() - time;
            fileSaveShort(arr);

            Response resp= new Response();
            resp.setResult(Integer.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if (num.getOperation()==2) {
            short res =  (1);
            short arr[] =  new short[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = (short)Math.round(num.getStart() + Math.random()*(num.getFinish()-1));
                res*=(arr[i]);
                short asd=8191;
                short asd3=(short)(asd*i);
            }
            time = System.nanoTime() - time;
            fileSaveShort(arr);

            Response resp= new Response();
            resp.setResult(Integer.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else {
            BigDecimal res =  BigDecimal.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
            short arr[] =  new short[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = (short)Math.round(num.getStart() + Math.random()*(num.getFinish()-1));
                res=res.divide(BigDecimal.valueOf(arr[i]), 100, RoundingMode.HALF_UP);
            }
            time = System.nanoTime() - time;
            fileSaveShort(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }
    }
    public Response calcgetDouble( Number num) throws Exception{
        if(num.getOperation()==0){
            BigDecimal res =  BigDecimal .valueOf(0);
            System.out.println("asfafaffasffwewfwefeewwtwwewtyweyewffgnmfgmgfmng");
            BigDecimal arr[] =  new BigDecimal[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
             //   BigDecimal asd=BigDecimal.valueOf(num.getStart() + Math.random()*(num.getFinish()-0.9));


                Long pre =num.getPrecision();
                boolean tochBool =true;
                BigDecimal min=BigDecimal.valueOf(num.getStart());
                BigDecimal max2=BigDecimal.valueOf(num.getFinish());
                BigDecimal randomBigDecimal = min.add(new BigDecimal(Math.random()).multiply(max2.subtract(min)));
                String decim="";
                while (tochBool){
                    if(pre>40){
                        randomBigDecimal = min.add(new BigDecimal(Math.random()).multiply(max2.subtract(min)));
                        String firstResult = String.format("%."+40+"f",randomBigDecimal);
                        if(decim.equals("")){
                            decim=firstResult;
                        }else{
                            String[] words = firstResult.split(",");
                            decim=decim+words[1];
                        }
                        pre-=40;
                    }else {
                        if(decim.equals("")){
                            String firstResult = String.format("%."+pre+"f",randomBigDecimal);
                            decim=firstResult;
                        }else {
                            randomBigDecimal = min.add(new BigDecimal(Math.random()).multiply(max2.subtract(min)));
                            String firstResult = String.format("%."+pre+"f",randomBigDecimal);
                            String[] words = firstResult.split(",");
                            decim=decim+words[1];
                        }
                        tochBool=false;
                    }
                }


                //String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                decim.replace(',', '.');
                BigDecimal bigDecimal2 = new BigDecimal(decim.replace(',', '.').toString()+"0");
                arr[i] = bigDecimal2;
                res=res.add((arr[i]));
            }
            time = System.nanoTime() - time;
            fileSaveDec(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if(num.getOperation()==1){
            BigDecimal res =  BigDecimal .valueOf(0);
            BigDecimal arr[] =  new BigDecimal[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-0.9);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = BigDecimal.valueOf(Double.parseDouble(firstResult.replace(',', '.')));
                res=res.subtract((arr[i]));
            }
            time = System.nanoTime() - time;
            fileSaveDec(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else if(num.getOperation()==2){
            BigDecimal res =  BigDecimal .valueOf(1);
            BigDecimal arr[] =  new BigDecimal[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-0.9);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = BigDecimal.valueOf(Double.parseDouble(firstResult.replace(',', '.')));
                res=res.multiply((arr[i]));
            }
            time = System.nanoTime() - time;
            fileSaveDec(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));

            return resp;
        }else {
            BigDecimal res =  BigDecimal.valueOf(1);
            BigDecimal arr[] =  new BigDecimal[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-0.9);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = BigDecimal.valueOf(Double.parseDouble(firstResult.replace(',', '.')));
                //res=res.divide(BigDecimal.valueOf(arr[i]));
                res=res.divide((arr[i]), 100, RoundingMode.HALF_UP);
            }
            time = System.nanoTime() - time;
            fileSaveDec(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));

            return resp;
        }
    }
    public Response calcgetFloatDouble( Number num) throws Exception{
        if(num.getOperation()==0){
            float res = 0f;
            float arr[] =  new float[num.getSize()];
            long time = System.nanoTime();
            System.out.println("asdasdasdasd");
            for (int i = 0; i <arr.length; i++) {
                float asd= (float) (num.getStart() + Math.random()*(num.getFinish()-0.9f));
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = asd;
                res+=arr[i];
            }
            time = System.nanoTime() - time;
            fileSaveDouble(arr);

            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if(num.getOperation()==1){
            float res = 0f;
            float arr[] =  new float[num.getSize()];

            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                float asd= (float) (num.getStart() + Math.random()*(num.getFinish()-0.9f));
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = asd;
                res-=(arr[i]);
            }
            time = System.nanoTime() - time;
            fileSaveDouble(arr);

            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else if(num.getOperation()==2){
            float res =1f;
            float arr[] =  new float[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                float asd= (float) (num.getStart() + Math.random()*(num.getFinish()-0.9f));
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = asd;
                res*=(arr[i]);
            }
            time = System.nanoTime() - time;
            fileSaveDouble(arr);

            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));

            return resp;
        }else {
            float res = 0f;
            float arr[] =  new float[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                float asd= (float) (num.getStart() + Math.random()*(num.getFinish()-0.9f));
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = asd;
                //res=res.divide(BigDecimal.valueOf(arr[i]));
                res/=(arr[i]);
            }
            time = System.nanoTime() - time;
            fileSaveDouble(arr);

            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));

            return resp;
        }
    }
    @PostMapping("/calculateget")
    public Response calcget(@RequestBody Number num) {

        try{
            if(num.getType()==0&&num.getTypeArray()==0&&num.getTypeVarInt()==0){
                return calcgetInt(num);
            }else if(num.getType()==1&&num.getTypeArray()==0&&num.getTypeVarFloat()==0) {
                System.out.println(num.getTypeVarInt());
                return calcgetDouble(num);

            }if(num.getType()==0&&num.getTypeArray()==0&&num.getTypeVarInt()==1){
                return calcgetShortInt(num);
            }else if(num.getType()==1&&num.getTypeArray()==0&&num.getTypeVarFloat()==1) {
                return calcgetFloatDouble(num);
            }
            if(num.getType()==0&&num.getTypeArray()==1&&num.getTypeVarInt()==0){
                return calcgetIntList(num);
            }else if(num.getType()==1&&num.getTypeArray()==1&&num.getTypeVarInt()==0) {
                return calcgetDoubleList(num);

            }if(num.getType()==0&&num.getTypeArray()==1&&num.getTypeVarInt()==1){
                return calcgetShortIntList(num);
            }else if(num.getType()==1&&num.getTypeArray()==1&&num.getTypeVarInt()==1) {
                return calcgetFloatDoubleList(num);
            }
            return null;
        }catch (Throwable e){
            Response resp= new Response();
            resp.setResult(e.toString());
            return resp;
        }

    }
    public Response calcgetIntList( Number num) throws Exception{
        if(num.getOperation()==0){
            BigInteger res =  BigInteger.valueOf(0);
            ///ArrayList arr[] =  new long[num.getSize()];
            ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                arr.add(i, BigInteger.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1))));
                res=res.add((arr.get(i)));
            }
            time = System.nanoTime() - time;
            fileSaveList(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if (num.getOperation()==1) {
            BigInteger res =  BigInteger.valueOf(0);
            ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                arr.add(i, BigInteger.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1))));
                res=res.subtract((arr.get(i)));
            }
            time = System.nanoTime() - time;
            fileSaveList(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if (num.getOperation()==2) {
            BigInteger res =  BigInteger.valueOf(1);
            ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                arr.add(i, BigInteger.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1))));
                res=res.multiply((arr.get(i)));
            }
            time = System.nanoTime() - time;
            fileSaveList(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else {
            BigDecimal res =  BigDecimal.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
            float arr[] =  new float[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = Math.round(num.getStart() + Math.random()*(num.getFinish()-1));
                res=res.divide(BigDecimal.valueOf(arr[i]), 100, RoundingMode.HALF_UP);
            }
            time = System.nanoTime() - time;
            fileSaveDouble(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }
    }
    public Response calcgetShortIntList( Number num) throws Exception{
        if(num.getOperation()==0){
            short res =  (0);
            ArrayList<Short> arr = new ArrayList<Short>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                arr.add(i, (short)Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
                res+=(arr.get(i));
            }
            time = System.nanoTime() - time;
            fileSaveShortList(arr);

            Response resp= new Response();
            resp.setResult(Integer.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if (num.getOperation()==1) {
            short res =  (0);
            ArrayList<Short> arr = new ArrayList<Short>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                arr.add(i, (short)Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
                res-=(arr.get(i));
            }
            time = System.nanoTime() - time;
            fileSaveShortList(arr);

            Response resp= new Response();
            resp.setResult(Integer.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if (num.getOperation()==2) {
            short res =  (1);
            ArrayList<Short> arr = new ArrayList<Short>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                arr.add(i, (short)Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
                res*=(arr.get(i));
            }
            time = System.nanoTime() - time;
            fileSaveShortList(arr);

            Response resp= new Response();
            resp.setResult(Integer.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else {
            BigDecimal res =  BigDecimal.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
            float arr[] =  new float[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = Math.round(num.getStart() + Math.random()*(num.getFinish()-1));
                res=res.divide(BigDecimal.valueOf(arr[i]), 100, RoundingMode.HALF_UP);
            }
            time = System.nanoTime() - time;
            fileSaveDouble(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }
    }
    public Response calcgetDoubleList( Number num) throws Exception{
        if(num.getOperation()==0){
            BigDecimal res =  BigDecimal .valueOf(0);

            ArrayList<BigDecimal> arr = new ArrayList<BigDecimal>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr.add(i, BigDecimal.valueOf(Double.parseDouble(firstResult.replace(',', '.'))));
                res=res.add((arr.get(i)));
            }
            time = System.nanoTime() - time;
            fileSaveDecList(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if(num.getOperation()==1){
            BigDecimal res =  BigDecimal .valueOf(0);
            ArrayList<BigDecimal> arr = new ArrayList<BigDecimal>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr.add(i, BigDecimal.valueOf(Double.parseDouble(firstResult.replace(',', '.'))));
                res=res.subtract((arr.get(i)));
            }
            time = System.nanoTime() - time;
            fileSaveDecList(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else if(num.getOperation()==2){
            BigDecimal res =  BigDecimal .valueOf(1);
            ArrayList<BigDecimal> arr = new ArrayList<BigDecimal>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr.add(i, BigDecimal.valueOf(Double.parseDouble(firstResult.replace(',', '.'))));
                res=res.multiply((arr.get(i)));
            }
            time = System.nanoTime() - time;
            fileSaveDecList(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));

            return resp;
        }else {
            BigDecimal res =  BigDecimal.valueOf(1);
            ArrayList<BigDecimal> arr = new ArrayList<BigDecimal>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr.add(i, BigDecimal.valueOf(Double.parseDouble(firstResult.replace(',', '.'))));
                //res=res.divide(BigDecimal.valueOf(arr[i]));
                res=res.divide((arr.get(i)), 100, RoundingMode.HALF_UP);
            }
            time = System.nanoTime() - time;
            fileSaveDecList(arr);

            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));

            return resp;
        }
    }
    public Response calcgetFloatDoubleList( Number num) throws Exception{
        if(num.getOperation()==0){
            float res = 0f;
            ArrayList<Float> arr = new ArrayList<Float>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr.add(i, Float.parseFloat(firstResult.replace(',', '.')));
                res+=arr.get(i);
            }
            time = System.nanoTime() - time;
            fileSaveDList(arr);

            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if(num.getOperation()==1){
            float res = 0f;
            ArrayList<Float> arr = new ArrayList<Float>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr.add(i, Float.parseFloat(firstResult.replace(',', '.')));
                res-=(arr.get(i));
            }
            time = System.nanoTime() - time;
            fileSaveDList(arr);

            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else if(num.getOperation()==2){
            float res =1f;
            ArrayList<Float> arr = new ArrayList<Float>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr.add(i, Float.parseFloat(firstResult.replace(',', '.')));
                res*=(arr.get(i));
            }
            time = System.nanoTime() - time;
            fileSaveDList(arr);

            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));

            return resp;
        }else {
            float res = 0f;
            ArrayList<Float> arr = new ArrayList<Float>();
            long time = System.nanoTime();
            for (int i = 0; i <num.getSize(); i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr.add(i, Float.parseFloat(firstResult.replace(',', '.')));
                //res=res.divide(BigDecimal.valueOf(arr[i]));
                res/=(arr.get(i));
            }
            time = System.nanoTime() - time;
            fileSaveDList(arr);

            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));

            return resp;
        }
    }

}

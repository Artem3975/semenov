package com.example.calculatearrayspring;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

@RestController
@CrossOrigin(origins = "*",  allowedHeaders = "*")
@RequestMapping("/calc/")
public class CalculateController {



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
                res+=(arr[i]);
            }
            time = System.nanoTime() - time;
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
            Response resp= new Response();
            resp.setResult(Integer.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else {
            BigDecimal res =  BigDecimal.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
            double arr[] =  new double[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = Math.round(num.getStart() + Math.random()*(num.getFinish()-1));
                res=res.divide(BigDecimal.valueOf(arr[i]), 100, RoundingMode.HALF_UP);
            }
            time = System.nanoTime() - time;
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
            BigDecimal arr[] =  new BigDecimal[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = BigDecimal.valueOf(Double.parseDouble(firstResult.replace(',', '.')));
                res=res.add((arr[i]));
            }
            time = System.nanoTime() - time;
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
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = BigDecimal.valueOf(Double.parseDouble(firstResult.replace(',', '.')));
                res=res.subtract((arr[i]));
            }
            time = System.nanoTime() - time;
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
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = BigDecimal.valueOf(Double.parseDouble(firstResult.replace(',', '.')));
                res=res.multiply((arr[i]));
            }
            time = System.nanoTime() - time;
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
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = BigDecimal.valueOf(Double.parseDouble(firstResult.replace(',', '.')));
                //res=res.divide(BigDecimal.valueOf(arr[i]));
                res=res.divide((arr[i]), 100, RoundingMode.HALF_UP);
            }
            time = System.nanoTime() - time;
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
            double arr[] =  new double[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = Double.parseDouble(firstResult.replace(',', '.'));
                res+=arr[i];
            }
            time = System.nanoTime() - time;
            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        } else if(num.getOperation()==1){
            float res = 0f;
            double arr[] =  new double[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = Double.parseDouble(firstResult.replace(',', '.'));
                res-=(arr[i]);
            }
            time = System.nanoTime() - time;
            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else if(num.getOperation()==2){
            float res =1f;
            double arr[] =  new double[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = Double.parseDouble(firstResult.replace(',', '.'));
                res*=(arr[i]);
            }
            time = System.nanoTime() - time;
            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));

            return resp;
        }else {
            float res = 0f;
            double arr[] =  new double[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                double asd=num.getStart() + Math.random()*(num.getFinish()-1);
                String firstResult = String.format("%."+num.getPrecision()+"f",asd);
                arr[i] = Double.parseDouble(firstResult.replace(',', '.'));
                //res=res.divide(BigDecimal.valueOf(arr[i]));
                res/=(arr[i]);
            }
            time = System.nanoTime() - time;
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
            }else if(num.getType()==1&&num.getTypeArray()==0&&num.getTypeVarInt()==0) {
                return calcgetDouble(num);

            }if(num.getType()==0&&num.getTypeArray()==0&&num.getTypeVarInt()==1){
                return calcgetShortInt(num);
            }else if(num.getType()==1&&num.getTypeArray()==0&&num.getTypeVarInt()==1) {
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
            Response resp= new Response();
            resp.setResult(res.toString()+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else {
            BigDecimal res =  BigDecimal.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
            double arr[] =  new double[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = Math.round(num.getStart() + Math.random()*(num.getFinish()-1));
                res=res.divide(BigDecimal.valueOf(arr[i]), 100, RoundingMode.HALF_UP);
            }
            time = System.nanoTime() - time;
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
            Response resp= new Response();
            resp.setResult(Integer.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));
            return resp;
        }else {
            BigDecimal res =  BigDecimal.valueOf(Math.round(num.getStart() + Math.random()*(num.getFinish()-1)));
            double arr[] =  new double[num.getSize()];
            long time = System.nanoTime();
            for (int i = 0; i <arr.length; i++) {
                arr[i] = Math.round(num.getStart() + Math.random()*(num.getFinish()-1));
                res=res.divide(BigDecimal.valueOf(arr[i]), 100, RoundingMode.HALF_UP);
            }
            time = System.nanoTime() - time;
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
            Response resp= new Response();
            resp.setResult(Float.toString(res)+"  .");
            BigDecimal res12 =  BigDecimal .valueOf(NANOSECONDS.convert(time, NANOSECONDS));
            res12=res12.divide(BigDecimal.valueOf(1000000000), 9, RoundingMode.HALF_UP);
            resp.setTime((res12+" s"));

            return resp;
        }
    }

}

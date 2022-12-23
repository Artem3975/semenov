import './App.css';
import React, {useEffect, useState} from 'react';
import Select from 'react-select'
import Service from "./Service";


function App() {
    const [size, setSize] = useState(100);
    const [rangeStart, setRangeStart] = useState(1);
    const [rangeFinish, setRangeFinish] = useState(10);
    const [operation, setOperation] = useState( { value: 0, label: 'Плюс' });
    const [result, setResult] = useState("");
    const [time, setTime] = useState("");
    const [typeArray, setTypeArray] = useState(  { value: 0, label: 'Array' });
    const [typeVarFloat, setTypeVarFloat] = useState({ value: 0, label: 'BigDecimal' });
    const [typeVarInt, setTypeVarInt] = useState({ value: 0, label: 'BigInteger' });
    const [type, setType] = useState({ value: 0, label: 'Целые числа' });
    const [precision, setPrecision] = useState( 1);
    const [wait, setWait] = useState(0);
    const options = [
        { value: 0, label: 'Целые числа' },
        { value: 1, label: 'Дробные числа' }
    ]
    const optionsTypeArray = [
        { value: 0, label: 'Array' },
        { value: 1, label: 'ArrayList' }
    ]
    const optionsTypeVarFloat = [
        { value: 0, label: 'BigDecimal' },
        { value: 1, label: 'Float' }
    ]
    const optionsTypeVarInt = [
        { value: 0, label: 'BigInteger' },
        { value: 1, label: 'Short' }
    ]
    const optionsOperation = [
        { value: 0, label: 'Плюс' },
        { value: 1, label: 'Минус' },
        { value: 2, label: 'Умножить' },
        { value: 3, label: 'Делить' }
    ]
    const precisionDouble = [
        { value: 1, label: '1 знак после запятой' },
        { value: 2, label: '2 знака после запятой' },
        { value: 3, label: '3 знака после запятой' },
        { value: 4, label: '4 знака после запятой' },
        { value: 5, label: '5 знаков после запятой' },
        { value: 6, label: '6 знаков после запятой' },
        { value: 7, label: '7 знаков после запятой' },
        { value: 8, label: '8 знаков после запятой' },
        { value: 9, label: '9 знаков после запятой' }
    ]

    const calculate = () =>{

        Service.calculateget(size,rangeStart,rangeFinish,type.value,precision,operation.value,typeArray.value,typeVarFloat.value,typeVarInt.value).then(
            response => {
            console.log(response.data);
            setResult(response.data.result);
            setTime(response.data.time);

        });
    }
/**
    const calculate = () => {
        let arr =  new Array();
        let res =  0;
        let date= new Date();

        console.time('FirstWay');
        let t0 = performance.now();
        for (let i = 0; i <size; i++) {
            arr[i] = Math.floor(rangeStart + Math.random() * (rangeFinish + 1 - rangeStart));
            res=res+arr[i];
            // ещё какие-то выражения
        }
        let t1 = performance.now();
        console.timeEnd('FirstWay');
        console.log("Call to doSomething took " + (t1 - t0) + " milliseconds.");


        setResult(res);
        console.log(res);
    }*/

  return (
    <div className="main">
      <div className="calc">
          <div className={"size"}>
              <div className={"name"}>
                  <label>Тип массива </label>
              </div>
              <div className={"size_input"}>
                  <Select
                      defaultValue={typeArray}
                      options={optionsTypeArray}
                      onChange={setTypeArray}
                  />
              </div>
          </div >
          <div className={"type"}>
              <div className={"name"}>
                  <label>Размер массива </label>
              </div>
              <div className={"size_input"}>
                  <input  type="number"
                          id="size"
                          //nClick={(event) => event.target.select()}
                          className={"size_input2"}
                          value={size}
                          onChange={(event) => setSize(event.target.value)}
                  />
              </div>
          </div >
          <div className={"range"}>
              <div className={"name"}>
                  <label>Диапазон массива </label>
              </div>
              <div className={"input_range2"}>
                  <label >от</label>
                  <input  type="number"
                          id="rangeStart"
                          className={"input_range"}
                          value={rangeStart}
                          onChange={(event) => setRangeStart(event.target.value)}
                  />
              </div>
              <div className={"input_range2"}>
                  <label>до</label>

                  <input  type="number"
                          id="rangeFinish"
                          className={"input_range"}
                          value={rangeFinish}
                          onChange={(event) => {
                              setRangeFinish(event.target.value);
                              console.log(type);
                          }}
                  />
              </div>
          </div >
          <div className={"type"}>
              <div className={"name"}>
                  <label>Диапазон массива </label>
              </div>
              <div className={"size_input"}>
                  <Select
                      defaultValue={type}
                      options={options}
                      onChange={setType}
                  />
              </div>
          </div >
          {type.value ? (
              <div className={"type"}>
                  <div className={"name"}>
                      <label>Тип переменной</label>
                  </div>
                  <div className={"size_input"}>
                      <Select
                          defaultValue={typeVarFloat}
                          options={optionsTypeVarFloat}
                          onChange={setTypeVarFloat}
                      />
                  </div>
              </div >
          ):
              <div className={"type"}>
                  <div className={"name"}>
                      <label>Тип переменной</label>
                  </div>
                  <div className={"size_input"}>
                      <Select
                          defaultValue={typeVarInt}
                          options={optionsTypeVarInt}
                          onChange={setTypeVarInt}
                      />
                  </div>
              </div >
          }
          {type.value ? (
              <div className={"type"}>
                  <input  type="number"
                          id="size"
                      //nClick={(event) => event.target.select()}
                          className={"size_input2"}
                          value={precision}
                          onChange={(event) => setPrecision(event.target.value)}
                  />
              </div >
          ):(null) }

          <div className={"type"}>
              <div className={"name"}>
                  <label>Операция </label>
              </div>
              <div className={"size_input"}>
                  <Select
                      defaultValue={operation}
                      options={optionsOperation}
                      onChange={setOperation}
                  />
              </div>
          </div >
          <div className={""}>
              <button
                  className={""}
                  onClick={calculate}

              >Вычислить</button>
          </div>
          <div className={"result"}>
              <div className={"name"}>
                  <label>Результат выполнения </label>
              </div>
                  <label className={"result_label"}>{result} </label>

          </div >
          <div className={"result"}>
              <div className={"name"}>
                  <label>Время выполнения </label>
              </div>
              <label className={"result_label"}>{time} </label>

          </div >
          {/*<div className={"type"}>*/}
          {/*    <div className={"name"}>*/}
          {/*        <label>Время выполнения </label>*/}
          {/*    </div>*/}
          {/*    <div className={"name"}>*/}
          {/*        <label>Результат выполнени </label>*/}
          {/*    </div>*/}

          {/*</div >*/}
      </div>
    </div>
  );
}

export default App;

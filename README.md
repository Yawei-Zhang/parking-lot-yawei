## Parking Lot

----------停车---------
1.
Given 一个有空位的停车场和一辆车要停的车
When 这辆车停车
Then 车记录停车场

2.
Given 一个有空位的停车场和一辆车要停的车
When 这辆车停车
Then 停车场所停车辆列表里有这辆车

3.
Given 一个有空位的停车场和一辆车要停的车
When 这辆车停车
Then 停车场剩余空位-1

4.
Given 一个有空位的停车场和一辆车要停的车
When 这辆车停车
Then 返回true

5.
Given 一个没有空位的停车场和一辆车要停的车
When 这辆车停车
Then 返回false

6.
Given 一个没有空位的停车场和一辆车要停的车
When 这辆车停车
Then 车不记录停车场

7.
Given 一个没有空位的停车场和一辆车要停的车
When 这辆车停车
Then 停车场所停车辆列表里没有这辆车

8.
Given 一个没有空位的停车场和一辆车要停的车
When 这辆车停车
Then 剩余空位为0

9.
Given 一个有空位的停车场和一辆车已停的车
When 这辆车停车
Then throw RuntimeError “请勿重复停车”

----------取车---------
10.
Given 一辆车已停在停车场的车
When 这辆车取车
Then 车删除停车场记录

11.
Given 一辆车已停在停车场的车
When 这辆车取车
Then 停车场所停车辆列表里没有这辆车

12.
Given 一辆车已停在停车场的车
When 这辆车取车
Then 停车场剩余空位+1

13.
Given 一辆车已停在停车场的车
When 这辆车取车
Then 返回true

14.
Given 一辆未停的车
When 这辆车取车
Then throw RuntimeError “取车失败”

15.
Given 一个没有空位的停车场和一辆车要停的车
When 这辆车停车
Then 停车场所停车辆列表里没有这辆车

16.
Given 一个没有空位的停车场和一辆车要停的车
When 这辆车停车
Then 剩余空位为0

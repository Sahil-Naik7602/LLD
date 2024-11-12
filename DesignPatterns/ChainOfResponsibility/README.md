# CHAIN OF RESPONSIBILITY
* This is a behavioural design Pattern
* Here decision-making is sequential
* On each step there is an object which decides if request needs to be moved ahead in the chain or response should be sent back from that step
* Decision is to be made at each step, and the processing logic is decoupled from each other.

<img src="C:\Users\Sahil Kumar Naik\Desktop\Pvt\LLD\images\ChainOfResp1.png">
Eg: - Logger Framework

<hr>
Here I have done a small LLD to get the gist of Chain Of Responsibility DP.

__REQUIREMENTS :__
* An interviewee is negotiating its salary with HRs
* Each HR has a limit upto which they can approve salary
* If interviewee is asking for more salary more that the limit then, Employee who is manager of the Hiring manager must approve
* Each manager will have limit and this process will continue till there is a manager who has the bandwidth to approve the salary
<hr>

<img src="C:\Users\Sahil Kumar Naik\Desktop\Pvt\LLD\images\ChainOfResp2.png">
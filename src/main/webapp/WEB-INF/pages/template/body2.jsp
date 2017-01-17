
<div class="row-fluid container-center text-center">
	

        <div class="span6 well">
        
          <div id="calc-board">
			<div class="row-fluid">
				<div class="container-input">
					<input type="text" class="form-control input-group-lg reg_name"
						name="id" id="id" value="" readonly="readonly">
				</div>

			</div>
			<div class="row-fluid">
				<a class="btn btn-danger" onclick="clean()">C</a> <a
					class="btn btn-danger" onclick="clean()">AC</a> <a
					class="btn btn-info" onclick="print('%')">%</a> <a
					class="btn btn-info" onclick="print('/')">/</a>
			</div>

			<div class="row-fluid">
				<a class="btn btn-info" onclick="print('7')">7</a> <a
					class="btn btn-info" onclick="print('8')">8</a> <a
					class="btn btn-info" onclick="print('9')">9</a> <a
					class="btn btn-info" onclick="print('*')">*</a>
			</div>
			<div class="row-fluid">
				<a class="btn btn-info" onclick="print('4')">4</a> <a
					class="btn btn-info" onclick="print('5')">5</a> <a
					class="btn btn-info" onclick="print('6')">6</a> <a
					class="btn btn-info" onclick="print('-')">-</a>

			</div>
			<div class="row-fluid">
				<a class="btn btn-info" onclick="print('1')">1</a> <a
					class="btn btn-info" onclick="print('2')">2</a> <a
					class="btn btn-info" onclick="print('3')">3</a> <a
					class="btn btn-info" onclick="print('+')">+</a>
			</div>
			<div class="row-fluid">
				<a onclick="print('.')" class="btn btn-info" >.</a> <a class="btn btn-info"
					onclick="print('0')">0</a> <a onclick="operation()" class="btn btn-primary">=</a>
			</div>
		</div>
        </div>
        </div>
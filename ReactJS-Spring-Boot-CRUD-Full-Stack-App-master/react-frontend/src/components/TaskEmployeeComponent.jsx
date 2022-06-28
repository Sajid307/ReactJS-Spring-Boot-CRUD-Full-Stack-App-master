import React, { Component } from 'react'
import EmployeeService from '../services/EmployeeService'

class ViewEmployeeComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            employee: {}
        }
    }

    componentDidMount(){
        EmployeeService.getEmployeeById(this.state.id).then( res => {
            this.setState({employee: res.data});
        })
    }

    render() {
        return (
            <div>
                 <h2 className="text-center">Employees List</h2>
                 
                 <br></br>
                 <div className = "row">
                        <table className = "table table-striped table-bordered">

                            <thead>
                                <tr>
                                    <th> Project Title</th>
                                    <th> Start Date</th>
                                    <th> End Date</th>
                                    <th> Status</th>
                                </tr>
                            </thead>
                            
                        </table>

                 </div>

            </div>
        )
    }
}

export default ViewEmployeeComponent

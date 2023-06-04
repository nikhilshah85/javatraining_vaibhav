import { Component } from '@angular/core';
import { GetexternaldataService } from 'src/app/getexternaldata.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent {

  _getExternalDataObj:GetexternaldataService;

  constructor(_getExternalDataOBJREF:GetexternaldataService)
  {
    this._getExternalDataObj = _getExternalDataOBJREF;
    _getExternalDataOBJREF.getPostData();
  }

}

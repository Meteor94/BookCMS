package com.njit.lib.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.njit.lib.base.DaoSupportImpl;
import com.njit.lib.domain.Remark;
import com.njit.lib.service.RemarkService;
@Service
@Transactional
public class RemarkServiceImpl extends DaoSupportImpl<Remark> implements RemarkService{

}

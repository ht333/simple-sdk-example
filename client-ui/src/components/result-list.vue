/**
 * @file result-list.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/17/18
 */
<template>
<div style="text-align:center">
  <Row>
    <Col span="8">客户姓名</Col>
    <Col span="16">{{ detail.name }}</Col>
  </Row>
  <Row>
    <Col span="8">产品名称</Col>
    <Col span="16">{{ detail.products }}</Col>
  </Row>
  <Row>
    <Col span="8">售价</Col>
    <Col span="16">{{ detail.price }}</Col>
  </Row>
  <Row>
    <Col span="8">收货地址</Col>
    <Col span="16">{{ detail.province }} / {{ detail.city }} / {{ detail.area }}</Col>
  </Row>
  <Row>
    <Col span="8">SDK备份</Col>
    <Col span="16">
      <Button type="primary" @click="handleBackUp">备份</Button>
      <Button type="default" @click="showBackUp">查看备份</Button>
    </Col>
  </Row>
</div>
</template>
<script>
import Util from '@/libs/util'
export default {
  name: 'result-list',
  props: {
    orderId: 0,
    userId: 0
  },
  data () {
    return {
      detail: {
        orderId: 0,
        userId: 0,
        name: '',
        products: '',
        price: 0,
        province: '',
        city: '',
        area: ''
      },
      backupId: 0
    };
  },
  mounted () {
    Util.post('trade/detail', {
      id: this.orderId,
      userid: this.userId
    }).then (res => {
      this.detail = res.data;
    });
  },
  methods: {
    handleBackUp () {
      Util.post('backup/add', this.detail).then(res => {
        this.$Message.success("back up success");
        this.backupId = res.data.id;
      });
    },
    showBackUp () {
      Util.post('backup/get', {
        id: this.backupId
      }).then(res => {
        console.log(res.data);
      })
    }
  }
}
</script>
